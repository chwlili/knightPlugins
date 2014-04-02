package org.chw.game.ide.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.chw.game.ide.generator.Field;
import org.chw.game.ide.generator.SerializeableTemplate;
import org.chw.game.ide.proto.Element;
import org.chw.game.ide.proto.EnumField;
import org.chw.game.ide.proto.EnumType;
import org.chw.game.ide.proto.MessageComplexField;
import org.chw.game.ide.proto.MessageField;
import org.chw.game.ide.proto.MessageSimpleField;
import org.chw.game.ide.proto.MessageType;
import org.chw.game.ide.proto.Model;
import org.chw.game.ide.proto.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class ProtoGenerator implements IGenerator {
  /**
   * 生成资源
   */
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<Model> _filter = Iterators.<Model>filter(_allContents, Model.class);
    Iterable<Model> _iterable = IteratorExtensions.<Model>toIterable(_filter);
    for (final Model model : _iterable) {
      EList<Element> _elements = model.getElements();
      for (final Element message : _elements) {
        if ((message instanceof Type)) {
          this.generateMessage(((Type) message), fsa);
        }
      }
    }
  }
  
  /**
   * 生成消息
   */
  public void generateMessage(final Type message, final IFileSystemAccess fsa) {
    if ((message instanceof MessageType)) {
      String packName = this.getPackNameBy(((Type) message));
      String typeName = this.getTypeShortName(((Type) message));
      String typeComm = this.getNodeCommByPrev(message);
      HashSet<String> _hashSet = new HashSet<String>();
      HashSet<String> imports = _hashSet;
      ArrayList<Field> _arrayList = new ArrayList<Field>();
      ArrayList<Field> fields = _arrayList;
      MessageType msg = ((MessageType) message);
      EList<MessageField> _fields = msg.getFields();
      for (final MessageField field : _fields) {
        {
          String _name = field.getName();
          String fieldName = this.normalFieldName(_name);
          Field _field = new Field();
          Field row = _field;
          String _attr = field.getAttr();
          row.attr = _attr;
          row.name = fieldName;
          int _index = field.getIndex();
          row.index = _index;
          row.nativeType = "";
          row.actionType = "";
          String _nodeCommByNext = this.getNodeCommByNext(field);
          row.comm = _nodeCommByNext;
          String _hasFieldName = this.toHasFieldName(fieldName);
          row.test = _hasFieldName;
          fields.add(row);
          if ((field instanceof MessageComplexField)) {
            MessageComplexField complex = ((MessageComplexField) field);
            String _attr_1 = complex.getAttr();
            boolean _equals = _attr_1.equals("repeated");
            if (_equals) {
              Type _type = complex.getType();
              if ((_type instanceof EnumType)) {
                this.generateSimpleTypeList(fsa, "int");
                row.shortType = "int32";
                row.nativeType = "int32";
                String _rootPackName = this.getRootPackName();
                String _plus = (_rootPackName + "base.IntLit");
                row.actionType = _plus;
                imports.add(row.actionType);
              } else {
                Type _type_1 = complex.getType();
                this.generateComplexTypeList(fsa, _type_1);
                Type _type_2 = complex.getType();
                String _typeShortName = this.getTypeShortName(_type_2);
                row.shortType = _typeShortName;
                Type _type_3 = complex.getType();
                String _typeLongName = this.getTypeLongName(_type_3);
                row.nativeType = _typeLongName;
                String _plus_1 = (row.nativeType + "List");
                row.actionType = _plus_1;
                imports.add(row.nativeType);
                imports.add(row.actionType);
              }
            } else {
              Type _type_4 = complex.getType();
              if ((_type_4 instanceof EnumType)) {
                row.nativeType = "int32";
                row.actionType = "int";
              } else {
                Type _type_5 = complex.getType();
                String _typeLongName_1 = this.getTypeLongName(_type_5);
                row.nativeType = _typeLongName_1;
                row.actionType = row.nativeType;
                imports.add(row.actionType);
              }
            }
          } else {
            MessageSimpleField simple = ((MessageSimpleField) field);
            String _type_6 = simple.getType();
            String as3Type = this.simpleTypeToToAsType(_type_6);
            String _attr_2 = simple.getAttr();
            boolean _equals_1 = _attr_2.equals("repeated");
            if (_equals_1) {
              this.generateSimpleTypeList(fsa, as3Type);
              row.shortType = as3Type;
              String _type_7 = simple.getType();
              row.nativeType = _type_7;
              String _rootPackName_1 = this.getRootPackName();
              String _plus_2 = (_rootPackName_1 + "base.");
              String _substring = as3Type.substring(0, 1);
              String _upperCase = _substring.toUpperCase();
              String _plus_3 = (_plus_2 + _upperCase);
              String _substring_1 = as3Type.substring(1);
              String _plus_4 = (_plus_3 + _substring_1);
              String _plus_5 = (_plus_4 + "List");
              row.actionType = _plus_5;
              imports.add(row.actionType);
            } else {
              String _type_8 = simple.getType();
              row.nativeType = _type_8;
              row.actionType = as3Type;
            }
            boolean _equals_2 = as3Type.equals("ByteArray");
            if (_equals_2) {
              imports.add("flash.utils.ByteArray");
            }
          }
        }
      }
      String _rootPackName = this.getRootPackName();
      String _plus = (_rootPackName + "base.SerializeableData");
      imports.add(_plus);
      String _rootPackName_1 = this.getRootPackName();
      String packName1 = (_rootPackName_1 + "base");
      String typeName1 = "SerializeableData";
      String _replace = packName1.replace(".", "/");
      String _plus_1 = (_replace + "/");
      String _plus_2 = (_plus_1 + typeName);
      String _plus_3 = (_plus_2 + ".as");
      String _content = SerializeableTemplate.getContent(packName1, typeName1);
      fsa.generateFile(_plus_3, _content);
      ArrayList<String> _arrayList_1 = new ArrayList<String>();
      ArrayList<String> importList = _arrayList_1;
      for (final String importItem : imports) {
        importList.add(importItem);
      }
      Collections.<String>sort(importList);
      String _replace_1 = packName.replace(".", "/");
      String _plus_4 = (_replace_1 + "/");
      String _plus_5 = (_plus_4 + typeName);
      String _plus_6 = (_plus_5 + ".as");
      CharSequence _write = this.write(packName, typeName, typeComm, importList, fields);
      fsa.generateFile(_plus_6, _write);
      EList<Type> _types = msg.getTypes();
      for (final Type inner : _types) {
        this.generateMessage(inner, fsa);
      }
    } else {
      String packName_1 = this.getPackNameBy(((Type) message));
      String typeName_1 = message.getName();
      String typeComm_1 = this.getNodeCommByPrev(message);
      ArrayList<Field> _arrayList_2 = new ArrayList<Field>();
      ArrayList<Field> fields_1 = _arrayList_2;
      EnumType msg_1 = ((EnumType) message);
      EList<EnumField> _fields_1 = msg_1.getFields();
      for (final EnumField field_1 : _fields_1) {
        {
          Field _field = new Field();
          Field row = _field;
          String _name = field_1.getName();
          row.name = _name;
          int _index = field_1.getIndex();
          row.index = _index;
          String _nodeCommByNext = this.getNodeCommByNext(field_1);
          row.comm = _nodeCommByNext;
          fields_1.add(row);
        }
      }
      String _replace_2 = packName_1.replace(".", "/");
      String _plus_7 = (_replace_2 + "/");
      String _plus_8 = (_plus_7 + typeName_1);
      String _plus_9 = (_plus_8 + ".as");
      CharSequence _write_1 = this.write(packName_1, typeName_1, typeComm_1, fields_1);
      fsa.generateFile(_plus_9, _write_1);
      boolean _and = false;
      boolean _endsWith = packName_1.endsWith("trans");
      if (!_endsWith) {
        _and = false;
      } else {
        boolean _equals = typeName_1.equals("ErrorCode");
        _and = (_endsWith && _equals);
      }
      if (_and) {
        String errorCodePack = this.getRootPackName();
        boolean _endsWith_1 = errorCodePack.endsWith(".");
        if (_endsWith_1) {
          int _length = errorCodePack.length();
          int _minus = (_length - 1);
          String _substring = errorCodePack.substring(0, _minus);
          errorCodePack = _substring;
        }
        String _replace_3 = errorCodePack.replace(".", "/");
        String _plus_10 = (_replace_3 + "/ServerError.as");
        CharSequence _generateErrorCode = this.generateErrorCode(errorCodePack, "ServerError", typeComm_1, fields_1);
        fsa.generateFile(_plus_10, _generateErrorCode);
      }
    }
  }
  
  public String getRootPackName() {
    return "game.game.server.decoder.";
  }
  
  /**
   * 获取包名
   */
  public String getPackNameBy(final Model pack) {
    String path = "";
    String uri = pack.getName();
    boolean _equals = Objects.equal(uri, null);
    if (_equals) {
      uri = "";
      path = "";
      return this.getRootPackName();
    } else {
      String[] list = uri.split("\\.");
      for (final String seg : list) {
        String _plus = (path + ".");
        String _normalFieldName = this.normalFieldName(seg);
        String _plus_1 = (_plus + _normalFieldName);
        path = _plus_1;
      }
      String _rootPackName = this.getRootPackName();
      String _substring = path.substring(1);
      String _lowerCase = _substring.toLowerCase();
      return (_rootPackName + _lowerCase);
    }
  }
  
  /**
   * 获取类型的全局包路径
   */
  public String getPackNameBy(final Type type) {
    EObject model = ((EObject) type);
    boolean _and = false;
    EObject _eContainer = model.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _not = (!(model instanceof Model));
      _and = (_notEquals && _not);
    }
    boolean _while = _and;
    while (_while) {
      EObject _eContainer_1 = model.eContainer();
      model = _eContainer_1;
      boolean _and_1 = false;
      EObject _eContainer_2 = model.eContainer();
      boolean _notEquals_1 = (!Objects.equal(_eContainer_2, null));
      if (!_notEquals_1) {
        _and_1 = false;
      } else {
        boolean _not_1 = (!(model instanceof Model));
        _and_1 = (_notEquals_1 && _not_1);
      }
      _while = _and_1;
    }
    if ((model instanceof Model)) {
      return this.getPackNameBy(((Model) model));
    }
    return "";
  }
  
  /**
   * 获取类型长名称
   */
  public String getTypeLongName(final Type type) {
    String packName = this.getPackNameBy(type);
    String typeName = this.getTypeShortName(type);
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(packName, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _isEmpty = packName.isEmpty();
      boolean _equals = (_isEmpty == false);
      _and = (_notEquals && _equals);
    }
    if (_and) {
      String _plus = (packName + ".");
      String _plus_1 = (_plus + typeName);
      typeName = _plus_1;
    }
    return typeName;
  }
  
  /**
   * 获取类型短名称
   */
  public String getTypeShortName(final Type type) {
    Type typeRef = type;
    String _name = type.getName();
    String typeName = this.normalTypeName(_name);
    EObject _eContainer = typeRef.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    boolean _while = _notEquals;
    while (_while) {
      EObject _eContainer_1 = typeRef.eContainer();
      if ((_eContainer_1 instanceof Type)) {
        EObject _eContainer_2 = typeRef.eContainer();
        typeRef = ((Type) _eContainer_2);
        String _name_1 = typeRef.getName();
        String _normalTypeName = this.normalTypeName(_name_1);
        String _plus = (_normalTypeName + "$");
        String _plus_1 = (_plus + typeName);
        typeName = _plus_1;
      } else {
        EObject _eContainer_3 = typeRef.eContainer();
        if ((_eContainer_3 instanceof Model)) {
          if ((type instanceof MessageType)) {
            EObject _eContainer_4 = typeRef.eContainer();
            String modelName = ((Model) _eContainer_4).getName();
            boolean _equals = Objects.equal(modelName, null);
            if (_equals) {
              modelName = "";
            }
            String[] parts = modelName.split("\\.");
            boolean _and = false;
            boolean _notEquals_1 = (!Objects.equal(parts, null));
            if (!_notEquals_1) {
              _and = false;
            } else {
              final String[] _converted_parts = (String[])parts;
              int _size = ((List<String>)Conversions.doWrapArray(_converted_parts)).size();
              boolean _greaterThan = (_size > 0);
              _and = (_notEquals_1 && _greaterThan);
            }
            if (_and) {
              final String[] _converted_parts_1 = (String[])parts;
              int _size_1 = ((List<String>)Conversions.doWrapArray(_converted_parts_1)).size();
              int _minus = (_size_1 - 1);
              String _get = parts[_minus];
              String last = _get.toLowerCase();
              boolean _and_1 = false;
              boolean _equals_1 = last.equals("app");
              boolean _not = (!_equals_1);
              if (!_not) {
                _and_1 = false;
              } else {
                boolean _equals_2 = last.equals("trans");
                boolean _not_1 = (!_equals_2);
                _and_1 = (_not && _not_1);
              }
              if (_and_1) {
                final String[] _converted_parts_2 = (String[])parts;
                int _size_2 = ((List<String>)Conversions.doWrapArray(_converted_parts_2)).size();
                int _minus_1 = (_size_2 - 1);
                String _get_1 = parts[_minus_1];
                String _lowerCase = _get_1.toLowerCase();
                String _normalTypeName_1 = this.normalTypeName(_lowerCase);
                String _plus_2 = (_normalTypeName_1 + typeName);
                typeName = _plus_2;
              }
            }
          }
          return typeName;
        }
      }
      EObject _eContainer_5 = typeRef.eContainer();
      boolean _notEquals_2 = (!Objects.equal(_eContainer_5, null));
      _while = _notEquals_2;
    }
    return typeName;
  }
  
  /**
   * 向上获取节点注释
   */
  public String getNodeCommByPrev(final EObject semanticName) {
    return this.getNodeCommBy(semanticName, true);
  }
  
  /**
   * 向下获取节点注释
   */
  public String getNodeCommByNext(final EObject semanticName) {
    return this.getNodeCommBy(semanticName, false);
  }
  
  /**
   * 获取节点注释
   */
  public String getNodeCommBy(final EObject semanticNode, final boolean prefix) {
    String nodeComm = "";
    ICompositeNode node = NodeModelUtils.findActualNodeFor(semanticNode);
    boolean _notEquals = (!Objects.equal(node, null));
    if (_notEquals) {
      INode nextNode = node.getNextSibling();
      if (prefix) {
        INode _previousSibling = node.getPreviousSibling();
        nextNode = _previousSibling;
      }
      boolean _notEquals_1 = (!Objects.equal(nextNode, null));
      if (_notEquals_1) {
        String _text = nextNode.getText();
        nodeComm = _text;
        boolean _notEquals_2 = (!Objects.equal(nodeComm, null));
        if (_notEquals_2) {
          String _trim = nodeComm.trim();
          nodeComm = _trim;
          boolean _startsWith = nodeComm.startsWith("//");
          if (_startsWith) {
            String _substring = nodeComm.substring(2);
            nodeComm = _substring;
          } else {
            boolean _startsWith_1 = nodeComm.startsWith("/*");
            if (_startsWith_1) {
              int _length = nodeComm.length();
              int _minus = (_length - 2);
              String _substring_1 = nodeComm.substring(2, _minus);
              nodeComm = _substring_1;
            } else {
              nodeComm = null;
            }
          }
        } else {
          nodeComm = null;
        }
      } else {
        nodeComm = null;
      }
    }
    return nodeComm;
  }
  
  /**
   * 统一文件路径
   */
  public String normalPath(final String uri) {
    String path = "";
    String[] list = uri.split("\\.");
    for (final String segment : list) {
      {
        String part = this.normalFieldName(segment);
        String _substring = part.substring(0, 1);
        String _lowerCase = _substring.toLowerCase();
        String _substring_1 = part.substring(1);
        String seg = (_lowerCase + _substring_1);
        String _plus = (path + "/");
        String _plus_1 = (_plus + seg);
        path = _plus_1;
      }
    }
    boolean _isEmpty = path.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      String _substring = path.substring(1);
      path = _substring;
    }
    return path;
  }
  
  /**
   * 统一文件名称
   */
  public String normalTypeName(final String uri) {
    int _length = uri.length();
    boolean _greaterThan = (_length > 1);
    if (_greaterThan) {
      String _substring = uri.substring(0, 1);
      String _upperCase = _substring.toUpperCase();
      String _substring_1 = uri.substring(1);
      return (_upperCase + _substring_1);
    } else {
      return uri.toUpperCase();
    }
  }
  
  /**
   * 统一类型名称
   */
  public String normalFieldName(final String uri) {
    String name = this.normalTypeName(uri);
    String _substring = name.substring(0, 1);
    String _lowerCase = _substring.toLowerCase();
    String _substring_1 = name.substring(1);
    String _plus = (_lowerCase + _substring_1);
    name = _plus;
    return name;
  }
  
  /**
   * 获取Has函数名
   */
  public String toHasFieldName(final String uri) {
    String _substring = uri.substring(0, 1);
    String _upperCase = _substring.toUpperCase();
    String _plus = ("has" + _upperCase);
    String _substring_1 = uri.substring(1);
    return (_plus + _substring_1);
  }
  
  /**
   * 消息类型模板
   */
  public CharSequence write(final String packName, final String typeName, final String typeComm, final ArrayList<String> imports, final ArrayList<Field> fields) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import flash.utils.IDataInput;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import flash.utils.IDataOutput;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("import flash.utils.ByteArray;");
    _builder.newLine();
    {
      for(final String importRow : imports) {
        _builder.append("\t");
        _builder.append("import ");
        _builder.append(importRow, "	");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      boolean _notEquals = (!Objects.equal(typeComm, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.append(typeComm, "	 ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public final class ");
    _builder.append(typeName, "	");
    _builder.append(" extends SerializeableData");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private var _dic:Object={};");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* 内部字典对象");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public function getInner():Object");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return _dic;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      for(final Field field : fields) {
        _builder.append("\t\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.append(field.name, "		 ");
        _builder.append(" 是否有效");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("public function get ");
        _builder.append(field.test, "		");
        _builder.append("():Boolean");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return _dic[");
        _builder.append(field.index, "			");
        _builder.append("]!=null;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
        {
          boolean _notEquals_1 = (!Objects.equal(field.comm, null));
          if (_notEquals_1) {
            _builder.append("\t\t");
            _builder.append("/**");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append(" ");
            _builder.append("* ");
            _builder.append(field.comm, "		 ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
        _builder.append("public function get ");
        _builder.append(field.name, "		");
        _builder.append("():");
        _builder.append(field.actionType, "		");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return _dic[");
        _builder.append(field.index, "			");
        _builder.append("];");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("public function set ");
        _builder.append(field.name, "		");
        _builder.append("(value:");
        _builder.append(field.actionType, "		");
        _builder.append("):void");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("_dic[");
        _builder.append(field.index, "			");
        _builder.append("]=value;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* 反序列化");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public override function deserialize(input:ByteArray,endPos:int=int.MAX_VALUE):void");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("var tag:int=readTagFrom(input);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("while(tag!=0)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("var fieldNum:int=getFieldNum(tag);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("switch(fieldNum)");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("{");
    _builder.newLine();
    {
      for(final Field field_1 : fields) {
        _builder.append("\t\t\t\t\t");
        _builder.append("case ");
        _builder.append(field_1.index, "					");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("{");
        _builder.newLine();
        {
          boolean _equals = field_1.attr.equals("repeated");
          if (_equals) {
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("var items_");
            _builder.append(field_1.index, "						");
            _builder.append(":");
            _builder.append(field_1.actionType, "						");
            _builder.append("=_dic[");
            _builder.append(field_1.index, "						");
            _builder.append("];");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("if(!items_");
            _builder.append(field_1.index, "						");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("{");
            _builder.newLine();
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("items_");
            _builder.append(field_1.index, "							");
            _builder.append("=_dic[");
            _builder.append(field_1.index, "							");
            _builder.append("]=new ");
            _builder.append(field_1.actionType, "							");
            _builder.append("();");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
            {
              boolean _equals_1 = field_1.nativeType.equals("int32");
              if (_equals_1) {
                _builder.append("\t\t\t\t\t");
                _builder.append("\t");
                _builder.append("items_");
                _builder.append(field_1.index, "						");
                _builder.append(".addInt(readInt32From(input));");
                _builder.newLineIfNotEmpty();
              } else {
                boolean _equals_2 = field_1.nativeType.equals("uint32");
                if (_equals_2) {
                  _builder.append("\t\t\t\t\t");
                  _builder.append("\t");
                  _builder.append("items_");
                  _builder.append(field_1.index, "						");
                  _builder.append(".addInt(readUInt32From(input));");
                  _builder.newLineIfNotEmpty();
                } else {
                  boolean _equals_3 = field_1.nativeType.equals("sint32");
                  if (_equals_3) {
                    _builder.append("\t\t\t\t\t");
                    _builder.append("\t");
                    _builder.append("items_");
                    _builder.append(field_1.index, "						");
                    _builder.append(".addInt(readSInt32From(input));");
                    _builder.newLineIfNotEmpty();
                  } else {
                    boolean _equals_4 = field_1.nativeType.equals("int64");
                    if (_equals_4) {
                      _builder.append("\t\t\t\t\t");
                      _builder.append("\t");
                      _builder.append("items_");
                      _builder.append(field_1.index, "						");
                      _builder.append(".addString(readInt64From(input));");
                      _builder.newLineIfNotEmpty();
                    } else {
                      boolean _equals_5 = field_1.nativeType.equals("uint64");
                      if (_equals_5) {
                        _builder.append("\t\t\t\t\t");
                        _builder.append("\t");
                        _builder.append("items_");
                        _builder.append(field_1.index, "						");
                        _builder.append(".addString(readUInt64From(input));");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _equals_6 = field_1.nativeType.equals("sint64");
                        if (_equals_6) {
                          _builder.append("\t\t\t\t\t");
                          _builder.append("\t");
                          _builder.append("items_");
                          _builder.append(field_1.index, "						");
                          _builder.append(".addString(readSInt64From(input));");
                          _builder.newLineIfNotEmpty();
                        } else {
                          boolean _equals_7 = field_1.nativeType.equals("float");
                          if (_equals_7) {
                            _builder.append("\t\t\t\t\t");
                            _builder.append("\t");
                            _builder.append("items_");
                            _builder.append(field_1.index, "						");
                            _builder.append(".addNumber(readFloatFrom(input));");
                            _builder.newLineIfNotEmpty();
                          } else {
                            boolean _equals_8 = field_1.nativeType.equals("double");
                            if (_equals_8) {
                              _builder.append("\t\t\t\t\t");
                              _builder.append("\t");
                              _builder.append("items_");
                              _builder.append(field_1.index, "						");
                              _builder.append(".addNumber(readDoubleFrom(input));");
                              _builder.newLineIfNotEmpty();
                            } else {
                              boolean _equals_9 = field_1.nativeType.equals("bool");
                              if (_equals_9) {
                                _builder.append("\t\t\t\t\t");
                                _builder.append("\t");
                                _builder.append("items_");
                                _builder.append(field_1.index, "						");
                                _builder.append(".addBoolean(readBoolFrom(input));");
                                _builder.newLineIfNotEmpty();
                              } else {
                                boolean _equals_10 = field_1.nativeType.equals("string");
                                if (_equals_10) {
                                  _builder.append("\t\t\t\t\t");
                                  _builder.append("\t");
                                  _builder.append("items_");
                                  _builder.append(field_1.index, "						");
                                  _builder.append(".addString(readStringFrom(input));");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  boolean _equals_11 = field_1.nativeType.equals("bytes");
                                  if (_equals_11) {
                                    _builder.append("\t\t\t\t\t");
                                    _builder.append("\t");
                                    _builder.append("items_");
                                    _builder.append(field_1.index, "						");
                                    _builder.append(".addByteArray(readBytesFrom(input));");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    boolean _equals_12 = field_1.nativeType.equals("enum");
                                    if (_equals_12) {
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("items_");
                                      _builder.append(field_1.index, "						");
                                      _builder.append(".addInt(readint32From(input));");
                                      _builder.newLineIfNotEmpty();
                                    } else {
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("var item_");
                                      _builder.append(field_1.index, "						");
                                      _builder.append(":");
                                      _builder.append(field_1.nativeType, "						");
                                      _builder.append("=new ");
                                      _builder.append(field_1.nativeType, "						");
                                      _builder.append("();");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("var item_");
                                      _builder.append(field_1.index, "						");
                                      _builder.append("_len:int=readInt32From(input);");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("var item_");
                                      _builder.append(field_1.index, "						");
                                      _builder.append("_end:int=input.position+item_");
                                      _builder.append(field_1.index, "						");
                                      _builder.append("_len;");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("if(item_");
                                      _builder.append(field_1.index, "						");
                                      _builder.append("_len>0)");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("{");
                                      _builder.newLine();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("\t");
                                      _builder.append("item_");
                                      _builder.append(field_1.index, "							");
                                      _builder.append(".deserialize(input,item_");
                                      _builder.append(field_1.index, "							");
                                      _builder.append("_end);");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("}");
                                      _builder.newLine();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("input.position=item_");
                                      _builder.append(field_1.index, "						");
                                      _builder.append("_end;");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("items_");
                                      _builder.append(field_1.index, "						");
                                      _builder.append(".add");
                                      _builder.append(field_1.shortType, "						");
                                      _builder.append("(item_");
                                      _builder.append(field_1.index, "						");
                                      _builder.append(");");
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            _builder.append("\t\t\t\t\t");
            _builder.append("\t");
            _builder.append("break;");
            _builder.newLine();
          } else {
            {
              boolean _equals_13 = field_1.nativeType.equals("int32");
              if (_equals_13) {
                _builder.append("\t\t\t\t\t");
                _builder.append("\t");
                _builder.append("_dic[");
                _builder.append(field_1.index, "						");
                _builder.append("]=readInt32From(input);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t\t\t");
                _builder.append("\t");
                _builder.append("break;");
                _builder.newLine();
              } else {
                boolean _equals_14 = field_1.nativeType.equals("uint32");
                if (_equals_14) {
                  _builder.append("\t\t\t\t\t");
                  _builder.append("\t");
                  _builder.append("_dic[");
                  _builder.append(field_1.index, "						");
                  _builder.append("]=readUInt32From(input);");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t\t\t");
                  _builder.append("\t");
                  _builder.append("break;");
                  _builder.newLine();
                } else {
                  boolean _equals_15 = field_1.nativeType.equals("sint32");
                  if (_equals_15) {
                    _builder.append("\t\t\t\t\t");
                    _builder.append("\t");
                    _builder.append("_dic[");
                    _builder.append(field_1.index, "						");
                    _builder.append("]=readSInt32From(input);");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t\t\t");
                    _builder.append("\t");
                    _builder.append("break;");
                    _builder.newLine();
                  } else {
                    boolean _equals_16 = field_1.nativeType.equals("int64");
                    if (_equals_16) {
                      _builder.append("\t\t\t\t\t");
                      _builder.append("\t");
                      _builder.append("_dic[");
                      _builder.append(field_1.index, "						");
                      _builder.append("]=readInt64From(input);");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t\t\t\t");
                      _builder.append("\t");
                      _builder.append("break;");
                      _builder.newLine();
                    } else {
                      boolean _equals_17 = field_1.nativeType.equals("uint64");
                      if (_equals_17) {
                        _builder.append("\t\t\t\t\t");
                        _builder.append("\t");
                        _builder.append("_dic[");
                        _builder.append(field_1.index, "						");
                        _builder.append("]=readUInt64From(input);");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t\t\t");
                        _builder.append("\t");
                        _builder.append("break;");
                        _builder.newLine();
                      } else {
                        boolean _equals_18 = field_1.nativeType.equals("sint64");
                        if (_equals_18) {
                          _builder.append("\t\t\t\t\t");
                          _builder.append("\t");
                          _builder.append("_dic[");
                          _builder.append(field_1.index, "						");
                          _builder.append("]=readSInt64From(input);");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t\t\t");
                          _builder.append("\t");
                          _builder.append("break;");
                          _builder.newLine();
                        } else {
                          boolean _equals_19 = field_1.nativeType.equals("float");
                          if (_equals_19) {
                            _builder.append("\t\t\t\t\t");
                            _builder.append("\t");
                            _builder.append("_dic[");
                            _builder.append(field_1.index, "						");
                            _builder.append("]=readFloatFrom(input);");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t\t\t");
                            _builder.append("\t");
                            _builder.append("break;");
                            _builder.newLine();
                          } else {
                            boolean _equals_20 = field_1.nativeType.equals("double");
                            if (_equals_20) {
                              _builder.append("\t\t\t\t\t");
                              _builder.append("\t");
                              _builder.append("_dic[");
                              _builder.append(field_1.index, "						");
                              _builder.append("]=readDoubleFrom(input);");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t\t\t");
                              _builder.append("\t");
                              _builder.append("break;");
                              _builder.newLine();
                            } else {
                              boolean _equals_21 = field_1.nativeType.equals("bool");
                              if (_equals_21) {
                                _builder.append("\t\t\t\t\t");
                                _builder.append("\t");
                                _builder.append("_dic[");
                                _builder.append(field_1.index, "						");
                                _builder.append("]=readBoolFrom(input);");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t\t\t\t");
                                _builder.append("\t");
                                _builder.append("break;");
                                _builder.newLine();
                              } else {
                                boolean _equals_22 = field_1.nativeType.equals("string");
                                if (_equals_22) {
                                  _builder.append("\t\t\t\t\t");
                                  _builder.append("\t");
                                  _builder.append("_dic[");
                                  _builder.append(field_1.index, "						");
                                  _builder.append("]=readStringFrom(input);");
                                  _builder.newLineIfNotEmpty();
                                  _builder.append("\t\t\t\t\t");
                                  _builder.append("\t");
                                  _builder.append("break;");
                                  _builder.newLine();
                                } else {
                                  boolean _equals_23 = field_1.nativeType.equals("bytes");
                                  if (_equals_23) {
                                    _builder.append("\t\t\t\t\t");
                                    _builder.append("\t");
                                    _builder.append("_dic[");
                                    _builder.append(field_1.index, "						");
                                    _builder.append("]=readBytesFrom(input);");
                                    _builder.newLineIfNotEmpty();
                                    _builder.append("\t\t\t\t\t");
                                    _builder.append("\t");
                                    _builder.append("break;");
                                    _builder.newLine();
                                  } else {
                                    boolean _equals_24 = field_1.nativeType.equals("enum");
                                    if (_equals_24) {
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("_dic[");
                                      _builder.append(field_1.index, "						");
                                      _builder.append("]=readInt32From(input);");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("break;");
                                      _builder.newLine();
                                    } else {
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("var ");
                                      _builder.append(field_1.name, "						");
                                      _builder.append(":");
                                      _builder.append(field_1.actionType, "						");
                                      _builder.append("=new ");
                                      _builder.append(field_1.actionType, "						");
                                      _builder.append("();");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("var ");
                                      _builder.append(field_1.name, "						");
                                      _builder.append("_len:int=readInt32From(input);");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("var ");
                                      _builder.append(field_1.name, "						");
                                      _builder.append("_end:int=input.position+");
                                      _builder.append(field_1.name, "						");
                                      _builder.append("_len;");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("if(");
                                      _builder.append(field_1.name, "						");
                                      _builder.append("_len>0)");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("{");
                                      _builder.newLine();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("\t");
                                      _builder.append(field_1.name, "							");
                                      _builder.append(".deserialize(input,");
                                      _builder.append(field_1.name, "							");
                                      _builder.append("_end);");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("}");
                                      _builder.newLine();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("input.position=");
                                      _builder.append(field_1.name, "						");
                                      _builder.append("_end;");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("_dic[");
                                      _builder.append(field_1.index, "						");
                                      _builder.append("]=");
                                      _builder.append(field_1.name, "						");
                                      _builder.append(";");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("break;");
                                      _builder.newLine();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        _builder.append("\t\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t\t\t");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("skipFieldFrom(input,tag);");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("tag=input.position<endPos ? readTagFrom(input):0;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* 序列化");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public override function serialize(output:IDataOutput):void");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    {
      for(final Field field_2 : fields) {
        _builder.append("\t\t\t");
        _builder.append("if(_dic[");
        _builder.append(field_2.index, "			");
        _builder.append("]!=null)");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("{");
        _builder.newLine();
        {
          boolean _equals_25 = field_2.attr.equals("repeated");
          if (_equals_25) {
            {
              boolean _equals_26 = field_2.nativeType.equals("int32");
              if (_equals_26) {
                _builder.append("\t\t\t");
                _builder.append("\t");
                _builder.append("var ");
                _builder.append(field_2.name, "				");
                _builder.append("s:");
                _builder.append(field_2.actionType, "				");
                _builder.append("=_dic[");
                _builder.append(field_2.index, "				");
                _builder.append("];");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t");
                _builder.append("\t");
                _builder.append("for(var i");
                _builder.append(field_2.index, "				");
                _builder.append(":int=0;i");
                _builder.append(field_2.index, "				");
                _builder.append("<");
                _builder.append(field_2.name, "				");
                _builder.append("s.numInts;i");
                _builder.append(field_2.index, "				");
                _builder.append("++)");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t");
                _builder.append("\t");
                _builder.append("{");
                _builder.newLine();
                _builder.append("\t\t\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("writeInt32To(output,");
                _builder.append(field_2.index, "					");
                _builder.append(",");
                _builder.append(field_2.name, "					");
                _builder.append("s.getIntAt(i");
                _builder.append(field_2.index, "					");
                _builder.append("));");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t\t");
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
              } else {
                boolean _equals_27 = field_2.nativeType.equals("uint32");
                if (_equals_27) {
                  _builder.append("\t\t\t");
                  _builder.append("\t");
                  _builder.append("var ");
                  _builder.append(field_2.name, "				");
                  _builder.append("s:");
                  _builder.append(field_2.actionType, "				");
                  _builder.append("=_dic[");
                  _builder.append(field_2.index, "				");
                  _builder.append("];");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t");
                  _builder.append("\t");
                  _builder.append("for(var i");
                  _builder.append(field_2.index, "				");
                  _builder.append(":int=0;i");
                  _builder.append(field_2.index, "				");
                  _builder.append("<");
                  _builder.append(field_2.name, "				");
                  _builder.append("s.numInts;i");
                  _builder.append(field_2.index, "				");
                  _builder.append("++)");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t");
                  _builder.append("\t");
                  _builder.append("{");
                  _builder.newLine();
                  _builder.append("\t\t\t");
                  _builder.append("\t");
                  _builder.append("\t");
                  _builder.append("writeUInt32To(output,");
                  _builder.append(field_2.index, "					");
                  _builder.append(",");
                  _builder.append(field_2.name, "					");
                  _builder.append("s.getIntAt(i");
                  _builder.append(field_2.index, "					");
                  _builder.append("));");
                  _builder.newLineIfNotEmpty();
                  _builder.append("\t\t\t");
                  _builder.append("\t");
                  _builder.append("}");
                  _builder.newLine();
                } else {
                  boolean _equals_28 = field_2.nativeType.equals("sint32");
                  if (_equals_28) {
                    _builder.append("\t\t\t");
                    _builder.append("\t");
                    _builder.append("var ");
                    _builder.append(field_2.name, "				");
                    _builder.append("s:");
                    _builder.append(field_2.actionType, "				");
                    _builder.append("=_dic[");
                    _builder.append(field_2.index, "				");
                    _builder.append("];");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t");
                    _builder.append("\t");
                    _builder.append("for(var i");
                    _builder.append(field_2.index, "				");
                    _builder.append(":int=0;i");
                    _builder.append(field_2.index, "				");
                    _builder.append("<");
                    _builder.append(field_2.name, "				");
                    _builder.append("s.numInts;i");
                    _builder.append(field_2.index, "				");
                    _builder.append("++)");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t");
                    _builder.append("\t");
                    _builder.append("{");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    _builder.append("\t");
                    _builder.append("\t");
                    _builder.append("writeSInt32To(output,");
                    _builder.append(field_2.index, "					");
                    _builder.append(",");
                    _builder.append(field_2.name, "					");
                    _builder.append("s.getIntAt(i");
                    _builder.append(field_2.index, "					");
                    _builder.append("));");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t\t");
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                  } else {
                    boolean _equals_29 = field_2.nativeType.equals("int64");
                    if (_equals_29) {
                      _builder.append("\t\t\t");
                      _builder.append("\t");
                      _builder.append("var ");
                      _builder.append(field_2.name, "				");
                      _builder.append("s:");
                      _builder.append(field_2.actionType, "				");
                      _builder.append("=_dic[");
                      _builder.append(field_2.index, "				");
                      _builder.append("];");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t\t");
                      _builder.append("\t");
                      _builder.append("for(var i");
                      _builder.append(field_2.index, "				");
                      _builder.append(":int=0;i");
                      _builder.append(field_2.index, "				");
                      _builder.append("<");
                      _builder.append(field_2.name, "				");
                      _builder.append("s.numStrings;i");
                      _builder.append(field_2.index, "				");
                      _builder.append("++)");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t\t");
                      _builder.append("\t");
                      _builder.append("{");
                      _builder.newLine();
                      _builder.append("\t\t\t");
                      _builder.append("\t");
                      _builder.append("\t");
                      _builder.append("writeInt64To(output,");
                      _builder.append(field_2.index, "					");
                      _builder.append(",");
                      _builder.append(field_2.name, "					");
                      _builder.append("s.getStringAt(i");
                      _builder.append(field_2.index, "					");
                      _builder.append("));");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t\t");
                      _builder.append("\t");
                      _builder.append("}");
                      _builder.newLine();
                    } else {
                      boolean _equals_30 = field_2.nativeType.equals("uint64");
                      if (_equals_30) {
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("var ");
                        _builder.append(field_2.name, "				");
                        _builder.append("s:");
                        _builder.append(field_2.actionType, "				");
                        _builder.append("=_dic[");
                        _builder.append(field_2.index, "				");
                        _builder.append("];");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("for(var i");
                        _builder.append(field_2.index, "				");
                        _builder.append(":int=0;i");
                        _builder.append(field_2.index, "				");
                        _builder.append("<");
                        _builder.append(field_2.name, "				");
                        _builder.append("s.numStrings;i");
                        _builder.append(field_2.index, "				");
                        _builder.append("++)");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("{");
                        _builder.newLine();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("\t");
                        _builder.append("writeUInt64To(output,");
                        _builder.append(field_2.index, "					");
                        _builder.append(",");
                        _builder.append(field_2.name, "					");
                        _builder.append("s.getStringAt(i");
                        _builder.append(field_2.index, "					");
                        _builder.append("));");
                        _builder.newLineIfNotEmpty();
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("}");
                        _builder.newLine();
                      } else {
                        boolean _equals_31 = field_2.nativeType.equals("sint64");
                        if (_equals_31) {
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("var ");
                          _builder.append(field_2.name, "				");
                          _builder.append("s:");
                          _builder.append(field_2.actionType, "				");
                          _builder.append("=_dic[");
                          _builder.append(field_2.index, "				");
                          _builder.append("];");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("for(var i");
                          _builder.append(field_2.index, "				");
                          _builder.append(":int=0;i");
                          _builder.append(field_2.index, "				");
                          _builder.append("<");
                          _builder.append(field_2.name, "				");
                          _builder.append("s.numStrings;i");
                          _builder.append(field_2.index, "				");
                          _builder.append("++)");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("{");
                          _builder.newLine();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("\t");
                          _builder.append("writeSInt64To(output,");
                          _builder.append(field_2.index, "					");
                          _builder.append(",");
                          _builder.append(field_2.name, "					");
                          _builder.append("s.getStringAt(i");
                          _builder.append(field_2.index, "					");
                          _builder.append("));");
                          _builder.newLineIfNotEmpty();
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("}");
                          _builder.newLine();
                        } else {
                          boolean _equals_32 = field_2.nativeType.equals("float");
                          if (_equals_32) {
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("var ");
                            _builder.append(field_2.name, "				");
                            _builder.append("s:");
                            _builder.append(field_2.actionType, "				");
                            _builder.append("=_dic[");
                            _builder.append(field_2.index, "				");
                            _builder.append("];");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("for(var i");
                            _builder.append(field_2.index, "				");
                            _builder.append(":int=0;i");
                            _builder.append(field_2.index, "				");
                            _builder.append("<");
                            _builder.append(field_2.name, "				");
                            _builder.append("s.numNumbers;i");
                            _builder.append(field_2.index, "				");
                            _builder.append("++)");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("{");
                            _builder.newLine();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("\t");
                            _builder.append("writeFloatTo(output,");
                            _builder.append(field_2.index, "					");
                            _builder.append(",");
                            _builder.append(field_2.name, "					");
                            _builder.append("s.getNumberAt(i");
                            _builder.append(field_2.index, "					");
                            _builder.append("));");
                            _builder.newLineIfNotEmpty();
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("}");
                            _builder.newLine();
                          } else {
                            boolean _equals_33 = field_2.nativeType.equals("double");
                            if (_equals_33) {
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("var ");
                              _builder.append(field_2.name, "				");
                              _builder.append("s:");
                              _builder.append(field_2.actionType, "				");
                              _builder.append("=_dic[");
                              _builder.append(field_2.index, "				");
                              _builder.append("];");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("for(var i");
                              _builder.append(field_2.index, "				");
                              _builder.append(":int=0;i");
                              _builder.append(field_2.index, "				");
                              _builder.append("<");
                              _builder.append(field_2.name, "				");
                              _builder.append("s.numNumbers;i");
                              _builder.append(field_2.index, "				");
                              _builder.append("++)");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("{");
                              _builder.newLine();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("\t");
                              _builder.append("writeDoubleTo(output,");
                              _builder.append(field_2.index, "					");
                              _builder.append(",");
                              _builder.append(field_2.name, "					");
                              _builder.append("s.getNumberAt(i");
                              _builder.append(field_2.index, "					");
                              _builder.append("));");
                              _builder.newLineIfNotEmpty();
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("}");
                              _builder.newLine();
                            } else {
                              boolean _equals_34 = field_2.nativeType.equals("bool");
                              if (_equals_34) {
                                _builder.append("\t\t\t");
                                _builder.append("\t");
                                _builder.append("var ");
                                _builder.append(field_2.name, "				");
                                _builder.append("s:");
                                _builder.append(field_2.actionType, "				");
                                _builder.append("=_dic[");
                                _builder.append(field_2.index, "				");
                                _builder.append("];");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t\t");
                                _builder.append("\t");
                                _builder.append("for(var i");
                                _builder.append(field_2.index, "				");
                                _builder.append(":int=0;i");
                                _builder.append(field_2.index, "				");
                                _builder.append("<");
                                _builder.append(field_2.name, "				");
                                _builder.append("s.numBooleans;i");
                                _builder.append(field_2.index, "				");
                                _builder.append("++)");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t\t");
                                _builder.append("\t");
                                _builder.append("{");
                                _builder.newLine();
                                _builder.append("\t\t\t");
                                _builder.append("\t");
                                _builder.append("\t");
                                _builder.append("writeBoolTo(output,");
                                _builder.append(field_2.index, "					");
                                _builder.append(",");
                                _builder.append(field_2.name, "					");
                                _builder.append("s.getBooleanAt(i");
                                _builder.append(field_2.index, "					");
                                _builder.append("));");
                                _builder.newLineIfNotEmpty();
                                _builder.append("\t\t\t");
                                _builder.append("\t");
                                _builder.append("}");
                                _builder.newLine();
                              } else {
                                boolean _equals_35 = field_2.nativeType.equals("string");
                                if (_equals_35) {
                                  _builder.append("\t\t\t");
                                  _builder.append("\t");
                                  _builder.append("var ");
                                  _builder.append(field_2.name, "				");
                                  _builder.append("s:");
                                  _builder.append(field_2.actionType, "				");
                                  _builder.append("=_dic[");
                                  _builder.append(field_2.index, "				");
                                  _builder.append("];");
                                  _builder.newLineIfNotEmpty();
                                  _builder.append("\t\t\t");
                                  _builder.append("\t");
                                  _builder.append("for(var i");
                                  _builder.append(field_2.index, "				");
                                  _builder.append(":int=0;i");
                                  _builder.append(field_2.index, "				");
                                  _builder.append("<");
                                  _builder.append(field_2.name, "				");
                                  _builder.append("s.numStrings;i");
                                  _builder.append(field_2.index, "				");
                                  _builder.append("++)");
                                  _builder.newLineIfNotEmpty();
                                  _builder.append("\t\t\t");
                                  _builder.append("\t");
                                  _builder.append("{");
                                  _builder.newLine();
                                  _builder.append("\t\t\t");
                                  _builder.append("\t");
                                  _builder.append("\t");
                                  _builder.append("writeStringTo(output,");
                                  _builder.append(field_2.index, "					");
                                  _builder.append(",");
                                  _builder.append(field_2.name, "					");
                                  _builder.append("s.getStringAt(i");
                                  _builder.append(field_2.index, "					");
                                  _builder.append("));");
                                  _builder.newLineIfNotEmpty();
                                  _builder.append("\t\t\t");
                                  _builder.append("\t");
                                  _builder.append("}");
                                  _builder.newLine();
                                } else {
                                  boolean _equals_36 = field_2.nativeType.equals("bytes");
                                  if (_equals_36) {
                                    _builder.append("\t\t\t");
                                    _builder.append("\t");
                                    _builder.append("var ");
                                    _builder.append(field_2.name, "				");
                                    _builder.append("s:");
                                    _builder.append(field_2.actionType, "				");
                                    _builder.append("=_dic[");
                                    _builder.append(field_2.index, "				");
                                    _builder.append("];");
                                    _builder.newLineIfNotEmpty();
                                    _builder.append("\t\t\t");
                                    _builder.append("\t");
                                    _builder.append("for(var i");
                                    _builder.append(field_2.index, "				");
                                    _builder.append(":int=0;i");
                                    _builder.append(field_2.index, "				");
                                    _builder.append("<");
                                    _builder.append(field_2.name, "				");
                                    _builder.append("s.numByteArrays;i");
                                    _builder.append(field_2.index, "				");
                                    _builder.append("++)");
                                    _builder.newLineIfNotEmpty();
                                    _builder.append("\t\t\t");
                                    _builder.append("\t");
                                    _builder.append("{");
                                    _builder.newLine();
                                    _builder.append("\t\t\t");
                                    _builder.append("\t");
                                    _builder.append("\t");
                                    _builder.append("writeBytesTo(output,");
                                    _builder.append(field_2.index, "					");
                                    _builder.append(",");
                                    _builder.append(field_2.name, "					");
                                    _builder.append("s.getByteArrayAt(i");
                                    _builder.append(field_2.index, "					");
                                    _builder.append("));");
                                    _builder.newLineIfNotEmpty();
                                    _builder.append("\t\t\t");
                                    _builder.append("\t");
                                    _builder.append("}");
                                    _builder.newLine();
                                  } else {
                                    boolean _equals_37 = field_2.nativeType.equals("enum");
                                    if (_equals_37) {
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("var ");
                                      _builder.append(field_2.name, "				");
                                      _builder.append("s:");
                                      _builder.append(field_2.actionType, "				");
                                      _builder.append("=_dic[");
                                      _builder.append(field_2.index, "				");
                                      _builder.append("];");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("for(var i");
                                      _builder.append(field_2.index, "				");
                                      _builder.append(":int=0;i");
                                      _builder.append(field_2.index, "				");
                                      _builder.append("<");
                                      _builder.append(field_2.name, "				");
                                      _builder.append("s.numInts;i");
                                      _builder.append(field_2.index, "				");
                                      _builder.append("++)");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("{");
                                      _builder.newLine();
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("\t");
                                      _builder.append("writeEnumTo(output,");
                                      _builder.append(field_2.index, "					");
                                      _builder.append(",");
                                      _builder.append(field_2.name, "					");
                                      _builder.append("s.getIntAt(i");
                                      _builder.append(field_2.index, "					");
                                      _builder.append("));");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("}");
                                      _builder.newLine();
                                    } else {
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("var ");
                                      _builder.append(field_2.name, "				");
                                      _builder.append("s:");
                                      _builder.append(field_2.actionType, "				");
                                      _builder.append("=_dic[");
                                      _builder.append(field_2.index, "				");
                                      _builder.append("];");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("for(var i");
                                      _builder.append(field_2.index, "				");
                                      _builder.append(":int=0;i");
                                      _builder.append(field_2.index, "				");
                                      _builder.append("<");
                                      _builder.append(field_2.name, "				");
                                      _builder.append("s.num");
                                      _builder.append(field_2.shortType, "				");
                                      _builder.append("s;i");
                                      _builder.append(field_2.index, "				");
                                      _builder.append("++)");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("{");
                                      _builder.newLine();
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("\t");
                                      _builder.append("writeMessageTo(output,");
                                      _builder.append(field_2.index, "					");
                                      _builder.append(",");
                                      _builder.append(field_2.name, "					");
                                      _builder.append("s.get");
                                      _builder.append(field_2.shortType, "					");
                                      _builder.append("At(i");
                                      _builder.append(field_2.index, "					");
                                      _builder.append("));");
                                      _builder.newLineIfNotEmpty();
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("}");
                                      _builder.newLine();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            {
              boolean _equals_38 = field_2.nativeType.equals("int32");
              if (_equals_38) {
                _builder.append("\t\t\t");
                _builder.append("\t");
                _builder.append("writeInt32To(output,");
                _builder.append(field_2.index, "				");
                _builder.append(",_dic[");
                _builder.append(field_2.index, "				");
                _builder.append("]);");
                _builder.newLineIfNotEmpty();
              } else {
                boolean _equals_39 = field_2.nativeType.equals("uint32");
                if (_equals_39) {
                  _builder.append("\t\t\t");
                  _builder.append("\t");
                  _builder.append("writeUInt32To(output,");
                  _builder.append(field_2.index, "				");
                  _builder.append(",_dic[");
                  _builder.append(field_2.index, "				");
                  _builder.append("]);");
                  _builder.newLineIfNotEmpty();
                } else {
                  boolean _equals_40 = field_2.nativeType.equals("sint32");
                  if (_equals_40) {
                    _builder.append("\t\t\t");
                    _builder.append("\t");
                    _builder.append("writeSInt32To(output,");
                    _builder.append(field_2.index, "				");
                    _builder.append(",_dic[");
                    _builder.append(field_2.index, "				");
                    _builder.append("]);");
                    _builder.newLineIfNotEmpty();
                  } else {
                    boolean _equals_41 = field_2.nativeType.equals("int64");
                    if (_equals_41) {
                      _builder.append("\t\t\t");
                      _builder.append("\t");
                      _builder.append("writeInt64To(output,");
                      _builder.append(field_2.index, "				");
                      _builder.append(",_dic[");
                      _builder.append(field_2.index, "				");
                      _builder.append("]);");
                      _builder.newLineIfNotEmpty();
                    } else {
                      boolean _equals_42 = field_2.nativeType.equals("uint64");
                      if (_equals_42) {
                        _builder.append("\t\t\t");
                        _builder.append("\t");
                        _builder.append("writeUInt64To(output,");
                        _builder.append(field_2.index, "				");
                        _builder.append(",_dic[");
                        _builder.append(field_2.index, "				");
                        _builder.append("]);");
                        _builder.newLineIfNotEmpty();
                      } else {
                        boolean _equals_43 = field_2.nativeType.equals("sint64");
                        if (_equals_43) {
                          _builder.append("\t\t\t");
                          _builder.append("\t");
                          _builder.append("writeSInt64To(output,");
                          _builder.append(field_2.index, "				");
                          _builder.append(",_dic[");
                          _builder.append(field_2.index, "				");
                          _builder.append("]);");
                          _builder.newLineIfNotEmpty();
                        } else {
                          boolean _equals_44 = field_2.nativeType.equals("float");
                          if (_equals_44) {
                            _builder.append("\t\t\t");
                            _builder.append("\t");
                            _builder.append("writeFloatTo(output,");
                            _builder.append(field_2.index, "				");
                            _builder.append(",_dic[");
                            _builder.append(field_2.index, "				");
                            _builder.append("]);");
                            _builder.newLineIfNotEmpty();
                          } else {
                            boolean _equals_45 = field_2.nativeType.equals("double");
                            if (_equals_45) {
                              _builder.append("\t\t\t");
                              _builder.append("\t");
                              _builder.append("writeDoubleTo(output,");
                              _builder.append(field_2.index, "				");
                              _builder.append(",_dic[");
                              _builder.append(field_2.index, "				");
                              _builder.append("]);");
                              _builder.newLineIfNotEmpty();
                            } else {
                              boolean _equals_46 = field_2.nativeType.equals("bool");
                              if (_equals_46) {
                                _builder.append("\t\t\t");
                                _builder.append("\t");
                                _builder.append("writeBoolTo(output,");
                                _builder.append(field_2.index, "				");
                                _builder.append(",_dic[");
                                _builder.append(field_2.index, "				");
                                _builder.append("]);");
                                _builder.newLineIfNotEmpty();
                              } else {
                                boolean _equals_47 = field_2.nativeType.equals("string");
                                if (_equals_47) {
                                  _builder.append("\t\t\t");
                                  _builder.append("\t");
                                  _builder.append("writeStringTo(output,");
                                  _builder.append(field_2.index, "				");
                                  _builder.append(",_dic[");
                                  _builder.append(field_2.index, "				");
                                  _builder.append("]);");
                                  _builder.newLineIfNotEmpty();
                                } else {
                                  boolean _equals_48 = field_2.nativeType.equals("bytes");
                                  if (_equals_48) {
                                    _builder.append("\t\t\t");
                                    _builder.append("\t");
                                    _builder.append("writeBytesTo(output,");
                                    _builder.append(field_2.index, "				");
                                    _builder.append(",_dic[");
                                    _builder.append(field_2.index, "				");
                                    _builder.append("]);");
                                    _builder.newLineIfNotEmpty();
                                  } else {
                                    boolean _equals_49 = field_2.nativeType.equals("enum");
                                    if (_equals_49) {
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("writeEnumTo(output,");
                                      _builder.append(field_2.index, "				");
                                      _builder.append(",_dic[");
                                      _builder.append(field_2.index, "				");
                                      _builder.append("]);");
                                      _builder.newLineIfNotEmpty();
                                    } else {
                                      _builder.append("\t\t\t");
                                      _builder.append("\t");
                                      _builder.append("writeMessageTo(output,");
                                      _builder.append(field_2.index, "				");
                                      _builder.append(",_dic[");
                                      _builder.append(field_2.index, "				");
                                      _builder.append("]);");
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * 枚举类型模板
   */
  public CharSequence write(final String packName, final String typeName, final String typeComm, final ArrayList<Field> fields) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      boolean _notEquals = (!Objects.equal(typeComm, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.append(typeComm, "	 ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public final class ");
    _builder.append(typeName, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    {
      for(final Field field : fields) {
        {
          boolean _notEquals_1 = (!Objects.equal(field.comm, null));
          if (_notEquals_1) {
            _builder.append("\t\t");
            _builder.append("/**");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append(" ");
            _builder.append("* ");
            _builder.append(field.comm, "		 ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append(" ");
            _builder.append("*/");
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
        _builder.append("public static const ");
        _builder.append(field.name, "		");
        _builder.append(":int=");
        _builder.append(field.index, "		");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateErrorCode(final String packName, final String typeName, final String typeComm, final ArrayList<Field> fields) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      boolean _notEquals = (!Objects.equal(typeComm, null));
      if (_notEquals) {
        _builder.append("\t");
        _builder.append("/**");
        _builder.newLine();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("* ");
        _builder.append(typeComm, "	 ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public final class ");
    _builder.append(typeName, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private static var _dic:Object;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private static function init():void");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("_dic=new Object();");
    _builder.newLine();
    {
      for(final Field field : fields) {
        _builder.append("\t\t\t");
        _builder.append("_dic[");
        _builder.append(field.index, "			");
        _builder.append("]=\"");
        _builder.append(field.comm, "			");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* 获取错误息");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public static function getError(id:int):String");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(!_dic)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("init();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return _dic[id];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * 简单类型到AS类型
   */
  public String simpleTypeToToAsType(final String type) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(type,"int32")) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,"uint32")) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,"sint32")) {
        _matched=true;
        _switchResult = "int";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,"int64")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,"uint64")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,"sint64")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,"float")) {
        _matched=true;
        _switchResult = "Number";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,"double")) {
        _matched=true;
        _switchResult = "Number";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,"string")) {
        _matched=true;
        _switchResult = "String";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,"bool")) {
        _matched=true;
        _switchResult = "Boolean";
      }
    }
    if (!_matched) {
      if (Objects.equal(type,"bytes")) {
        _matched=true;
        _switchResult = "ByteArray";
      }
    }
    return _switchResult;
  }
  
  /**
   * 生成简单类型列表
   */
  public void generateSimpleTypeList(final IFileSystemAccess fsa, final String as3Type) {
    String importPath = "";
    boolean _equals = as3Type.equals("ByteArray");
    if (_equals) {
      importPath = "flash.utils.ByteArray";
    }
    String _rootPackName = this.getRootPackName();
    String packName = (_rootPackName + "base");
    String _substring = as3Type.substring(0, 1);
    String _upperCase = _substring.toUpperCase();
    String _substring_1 = as3Type.substring(1);
    String typeName = (_upperCase + _substring_1);
    String fileName = packName;
    String _replace = fileName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + typeName);
    String _plus_2 = (_plus_1 + "List.as");
    CharSequence _write = this.write(packName, importPath, typeName, as3Type);
    fsa.generateFile(_plus_2, _write);
  }
  
  /**
   * 生成复杂类型列表
   */
  public void generateComplexTypeList(final IFileSystemAccess fsa, final Type defType) {
    String packName = this.getPackNameBy(defType);
    String shortName = this.getTypeShortName(defType);
    String _replace = packName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + shortName);
    String fileName = (_plus_1 + "List.as");
    CharSequence _write = this.write(packName, null, shortName, shortName);
    fsa.generateFile(fileName, _write);
  }
  
  /**
   * 写入列表类型
   */
  public CharSequence write(final String packName, final String importType, final String typeName, final String as3TypeName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(importType, null));
      if (!_notEquals) {
        _and = false;
      } else {
        boolean _isEmpty = importType.isEmpty();
        boolean _not = (!_isEmpty);
        _and = (_notEquals && _not);
      }
      if (_and) {
        _builder.append("\t");
        _builder.append("import ");
        _builder.append(importType, "	");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("public final class ");
    _builder.append(typeName, "	");
    _builder.append("List");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("private var _list:Array=new Array();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* 列表元素个数");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public function get num");
    _builder.append(typeName, "		");
    _builder.append("s():int");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return _list.length;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* 获取指定索引处的列表元素");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public function get");
    _builder.append(typeName, "		");
    _builder.append("At(index:int):");
    _builder.append(as3TypeName, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return _list[index];");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* 添加");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public function add");
    _builder.append(typeName, "		");
    _builder.append("(item:");
    _builder.append(as3TypeName, "		");
    _builder.append("):void");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("_list.push(item);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* 删除");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public function remove");
    _builder.append(typeName, "		");
    _builder.append("(value:");
    _builder.append(as3TypeName, "		");
    _builder.append("):void");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("var index:int=_list.indexOf(value);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(index!=-1)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("_list.splice(index,1);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("* 清空");
    _builder.newLine();
    _builder.append("\t\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("public function clear");
    _builder.append(typeName, "		");
    _builder.append("s():void");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("_list.length=0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
