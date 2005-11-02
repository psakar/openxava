package org.openxava.util.xmlparse;

/**
 * @author Javier Paniza
 */
public class XmlElementsNames {

	// the x(xml element) is for no colisioning 
	protected final static String [] xname = { "name", "nombre" };
	protected final static String [] xlabel = { "label", "etiqueta" };	
	protected final static String [] xdescription = { "description", "descripcion" };
	protected final static String [] xview = { "view", "vista" };
	protected final static String [] xtab = { "tab", "tab"};
	protected final static String [] xclass = { "class", "clase"};
	protected final static String [] xcontroller = { "controller", "controlador" };
	protected final static String [] xvalue = { "value", "valor" };	
	protected final static String [] xenvironment_var = { "env-var", "var-entorno" };		
	protected final static String [] xmethod = { "method", "metodo" };
	protected final static String [] xhidden = { "hidden", "oculta" };
	protected final static String [] xset = { "set", "poner" };
	protected final static String [] xproperty = { "property", "propiedad" };
	protected final static String [] xfrom = { "from", "desde" };
	protected final static String [] xaction = { "action", "accion" };
	protected final static String [] xsize = { "size", "longitud" }; 
	protected final static String [] xfor_stereotype = { "for-stereotype", "para-estereotipo" };
	protected final static String [] xfor_type = { "for-type", "para-tipo" };
	protected final static String [] xstereotype = { "stereotype", "estereotipo" };
	protected final static String [] xtype = { "type", "tipo" };
	protected final static String [] xvalidator = { "validator", "validador" };
	protected final static String [] xurl = { "url", "url" };
	protected final static String [] xmodel = { "model", "modelo" };
	protected final static String [] xmodule = { "module", "modulo" };	
	protected final static String [] xswing_view = { "swing-view", "vista-swing" }; // only in swing version
	protected final static String [] xweb_view = { "web-view", "vista-web" };	
	protected final static String [] xmode_controller = { "mode-controller", "controlador-modo" };
	protected final static String [] xreport = { "report", "listado" }; // only in swing version
	protected final static String [] xaggregate = { "aggregate", "agregado" };
	protected final static String [] xformat = { "format", "formatear" };
	protected final static String [] xwithframe = { "frame", "enmarcable" };	
	protected final static String [] xframe = { "frame", "marco" };
	protected final static String [] xdepends_stereotypes = { "depends-stereotypes", "depende-de-estereotipos" };	
	protected final static String [] xdepends_properties = { "depends-properties", "depende-de-propiedades" };
	protected final static String [] xformatter = { "formatter", "formateador" };
	protected final static String [] xfor_model_property = { "for-model-property", "para-propiedad-modelo" };
	protected final static String [] xeditor = { "editor", "editor" };
	protected final static String [] xfor = { "for", "para" };
	protected final static String [] xcontext = { "context", "contexto" }; // only for spanish version (with swing and web)
	protected final static String [] xobject = { "object", "objeto" };
	protected final static String [] xmode = { "mode", "modo" };
	protected final static String [] ximage = { "image", "imagen" };
	protected final static String [] xkeystroke = { "keystroke", "atajo-de-teclado" };
	protected final static String [] xon_init = { "on-init", "al-iniciar" };
	protected final static String [] xby_default = { "by-default", "por-defecto" };
	protected final static String [] xnever  = { "never", "nunca" };
	protected final static String [] xif_possible = { "if-possible", "si-posible" };
	protected final static String [] xalmost_always = { "almost-always", "casi-siempre" };
	protected final static String [] xalways = { "always", "siempre" };
	protected final static String [] xaction_property = { "action-property", "propiedad-accion" };
	protected final static String [] xdepends = { "depends", "depende-de" };
	protected final static String [] xextends = { "extends", "hereda-de" };
	protected final static String [] xuse_object = { "use-object", "usa-objeto" };
	protected final static String [] xejb = { "ejb", "ejb" };
	protected final static String [] xremote = { "remote", "remote" }; 
	protected final static String [] xhome = { "home", "home" }; 
	protected final static String [] xprimaryKey = { "primaryKey", "primaryKey" };
	protected final static String [] xjndi = { "jndi", "jndi" };
	protected final static String [] xreference = { "reference", "referencia" };
	protected final static String [] xcollection = { "collection", "coleccion" };
	protected final static String [] xfinder = { "finder", "buscador" };
	protected final static String [] xpostcreate_calculator = { "postcreate-calculator", "calculador-poscrear" };
	protected final static String [] xon_create = { "on-create", "al-crear" };
	protected final static String [] xpostmodify_calculator = { "postmodify-calculator", "calculador-posmodificar" };
	protected final static String [] xremove_validator = { "remove-validator", "validador-borrar" };
	protected final static String [] ximplements = { "implements", "implementa" };
	protected final static String [] xinterface = { "interface", "interfaz" };
	protected final static String [] xpostremove_calculator = { "postremove-calculator", "calculador-posborrar" };
	protected final static String [] xbean = { "bean", "bean" };
	protected final static String [] xrequired = { "required", "requerido" };
	protected final static String [] xkey = { "key", "clave" };
	protected final static String [] xvalid_values = { "valid-values", "valores-posibles" };
	protected final static String [] xvalid_value = { "valid-value", "valor-posible" };
	protected final static String [] xarguments = { "arguments", "argumentos" };
	protected final static String [] xcondition = { "condition", "condicion" };
	protected final static String [] xorder = { "order", "orden" };
	protected final static String [] xexceptions = { "exceptions", "excepciones" };
	protected final static String [] xcalculator = { "calculator", "calculador" };
	protected final static String [] xdefault_value_calculator = { "default-value-calculator", "calculador-valor-defecto" };
	protected final static String [] xrole = { "role", "cometido-destino" };
	protected final static String [] xminimum = { "minimum", "minimo" };
	protected final static String [] xaggregate_mapping = { "aggregate-mapping", "mapeo-agregado" };
	protected final static String [] xtable = { "table", "tabla" };
	protected final static String [] xmodel_property = { "property", "propiedad-modelo" };
	protected final static String [] xtable_column = { "column", "columna-tabla" };
	protected final static String [] xcmp_type = { "cmp-type", "tipo-cmp" };
	protected final static String [] xmodel_reference = { "reference", "referencia-modelo" };
	protected final static String [] xreference_mapping_detail = { "reference-mapping-detail", "detalle-mapeo-referencia" };
	protected final static String [] xconverter = { "converter", "conversor" };
	protected final static String [] xcmp_field = { "cmp-field", "campo-cmp" };
	protected final static String [] xreferenced_model_property = { "referenced-model-property", "propiedad-modelo-referenciado" };
	protected final static String [] xconverter_property = { "converter-property", "propiedad-conversor" };
	protected final static String [] xproperty_mapping = { "property-mapping", "mapeo-propiedad" };
	protected final static String [] xmultiple_property_mapping = { "multiple-property-mapping", "mapeo-propiedad-multiple" };
	protected final static String [] xreference_mapping = { "reference-mapping", "mapeo-referencia" };
	protected final static String [] xentity = { "entity", "entidad" };
	protected final static String [] xmembers = { "members", "miembros" };
	protected final static String [] xgroup = { "group", "grupo" };
	protected final static String [] xsection = { "section", "seccion" };
	protected final static String [] xmediator = { "mediator", "mediador" };
	protected final static String [] xreference_view = { "reference-view", "vista-referencia" };
	protected final static String [] xcollection_view = { "collection-view", "vista-coleccion" };
	protected final static String [] xproperty_view = { "property-view", "vista-propiedad" };
	protected final static String [] xcreate = { "create", "crear" };
	protected final static String [] xread_only = { "read-only", "solo-lectura" };
	protected final static String [] xedit_only = { "edit-only", "solo-edicion" };
	protected final static String [] xlist_properties = { "list-properties", "propiedades-lista" };
	protected final static String [] xlabel_format = { "label-format", "formato-etiqueta" };
	protected final static String [] xon_change = { "on-change", "al-cambiar" };
	protected final static String [] xsearch_action = { "search-action", "accion-buscar" };
	protected final static String [] xsearch = { "search", "buscar" };
	protected final static String [] xedit_action = { "edit-action", "accion-editar" };
	protected final static String [] xdetail_action = { "detail-action", "accion-detalle" };
	protected final static String [] xlist_action = { "list-action", "accion-lista" };
	protected final static String [] xdescriptions_list = { "descriptions-list", "lista-descripciones" };
	protected final static String [] xdescription_property = { "description-property", "propiedad-descripcion" };
	protected final static String [] xdescription_properties = { "description-properties", "propiedades-descripcion" };
	protected final static String [] xorder_by_key = { "order-by-key", "ordenado-por-clave" };
	protected final static String [] xexclude_by_key = { "exclude-by-key", "excluir-por-clave" };
	protected final static String [] xexclude_all = { "exclude-all", "excluir-todos" };
	protected final static String [] xproperties = { "properties", "propiedades" };
	protected final static String [] xbase_condition = { "base-condition", "condicion-base" };
	protected final static String [] xdefault_order = { "default-order", "orden-defecto" };
	protected final static String [] xlike = { "like", "like" };
	protected final static String [] xrange = { "range", "rango" };
	protected final static String [] xlabel_id = { "label-id", "id-etiqueta" };
	protected final static String [] xfilter = { "filter", "filtro" };
	protected final static String [] xconsult = { "consult", "consulta" };
	protected final static String [] xparameter = { "parameter", "parametro" };
	protected final static String [] xentity_mapping = { "entity-mapping", "mapeo-entidad" };
	protected final static String [] xpackage = { "package", "paquete" };
	protected final static String [] XNORMAL = { "NORMAL", "NORMAL" };
	protected final static String [] XSMALL = { "SMALL", "PEQUE�A" };
	protected final static String [] XNO_LABEL = { "NO_LABEL", "SIN_ETIQUETA" };
	protected final static String [] xstyle = { "style", "estilo" };
	protected final static String [] xrow_style = { "row-style", "estilo-fila" };
	protected final static String [] xfrom_type = { "from-type", "del-tipo" };
	protected final static String [] xmodel_type = { "model-type", "tipo-modelo" };
	protected final static String [] xconverter_class = { "converter-class", "clase-conversor" };
	protected final static String [] xtakes_long = { "takes-long", "cuesta" };
	protected final static String [] xconfirm = { "confirm", "confirmar" };
	protected final static String [] xcreate_reference = { "create-reference", "crear-referencia" };
	protected final static String [] xview_action = { "view-action", "accion-ver" };
	protected final static String [] xonly_on_create = { "only-on-create", "solo-al-crear" };
	
}
