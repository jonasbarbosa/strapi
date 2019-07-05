package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity(filter = "Public", post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class Strapi {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// strapi
public static Var api() throws Exception {
 return new Callable<Var>() {

   private Var url = Var.VAR_NULL;
   private Var obj = Var.VAR_NULL;

   public Var call() throws Exception {
    url = Var.valueOf(Var.valueOf("https://letsappgo.herokuapp.com/").toString() + cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.radioType")).toString());
    obj = cronapi.json.Operations.toJson(cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/json"), url, Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.title"), cronapi.object.Operations.getObjectField(cronapi.list.Operations.getFirst(obj), Var.valueOf("title")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.conteudo"), cronapi.object.Operations.getObjectField(cronapi.list.Operations.getFirst(obj), Var.valueOf("content")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.criadoem"), cronapi.object.Operations.getObjectField(cronapi.list.Operations.getFirst(obj), Var.valueOf("createdAt")));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var postaTitle() throws Exception {
 return new Callable<Var>() {

   private Var url = Var.VAR_NULL;
   private Var fields = Var.VAR_NULL;

   public Var call() throws Exception {
    url = Var.valueOf(Var.valueOf("http://localhost:1337/eventos/").toString());
    fields = cronapi.util.Operations.getURLFromOthers(Var.valueOf("POST"), Var.valueOf("application/x-www-form-urlencoded"), url, Var.VAR_NULL, Var.VAR_NULL, cronapi.map.Operations.createObjectMapWith(Var.valueOf("title",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.titulo"))) , Var.valueOf("content",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.conteudo")))));
    System.out.println(fields.getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

