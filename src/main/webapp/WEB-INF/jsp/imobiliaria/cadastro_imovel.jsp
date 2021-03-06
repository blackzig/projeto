<%-- 
    Document   : cadastro_imovel
    Created on : 01/11/2015, 09:49:42
    Author     : Michel A. Medeiros
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
    xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
    layout:decorator="template/LayoutPadrao"
    xmlns:th="http://www.thymeleaf.org">

<section layout:fragment="conteudo">
    <form class="form-horizontal" method="POST" th:object="${imovel}" th:action="${#mvc.url('IC#adicionar').build()}">

        <div layout:include="fragment/MensagensFragment" th:remove="tag"></div>

        <div class="panel panel-default">
            <div class="panel-heading">
                <div class="clearfix">
                    <h1 class="panel-title titulo-painel">Cadastro do Imóvel</h1>
                    <a class="btn btn-link link-painel" >Voltar para pesquisa</a>
                </div>
            </div>

            <div class="panel-body">
                <div class="form-group required" th:classappend="${#fields.hasErrors('descricao')} ? has-error">
                    <label for="descricao" class="col-sm-2 control-label">Descrição</label>
                    <div class="col-sm-6">
                        <textarea id="descricao" class="form-control" rows="3"
                            th:field="*{descricao}"></textarea>
                    </div>
                </div>
                
                <div class="form-group required" th:classappend="${#fields.hasErrors('bairro')} ? has-error">
                    <label for="bairro" class="col-sm-2 control-label">Bairro</label>
                    <div class="col-sm-2">
                        <input id="bairro" th:field="*{bairro}" type="text" class="form-control" />
                    </div>
                </div>

                <div class="form-group required" th:classappend="${#fields.hasErrors('valor')} ? has-error">
                    <label for="valor" class="col-sm-2 control-label">Valor</label>
                    <div class="col-sm-2">
                        <input id="valor" th:field="*{valor}" type="text" class="form-control js-moeda" />
                    </div>
                </div>

                <div class="form-group required" th:classappend="${#fields.hasErrors('tipo')} ? has-error">
                    <label for="tipo" class="col-sm-2 control-label">Tipo</label>
                    <div class="col-sm-2">
                        <select class="form-control" th:field="*{tipo}">
                            <option value="">Selecione</option>
                            <option th:each="tipo : ${tipoImovelList}" th:value="${tipo}"
                                th:text="${tipo.descricao}"></option>
                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <label for="area" class="col-sm-2 control-label">Área</label>
                    <div class="col-sm-2">
                        <input id="area" th:field="*{area}" type="text" class="form-control" />
                    </div>
                </div>
                
                <div class="form-group">
                    <label class="col-sm-2 control-label">Quartos</label>
                    <div class="col-sm-10">
                        <div class="form-group" style="margin-bottom: 0px;">
                            <div class="col-sm-1">
                                <input type="text" class="form-control" th:field="*{ambiente.quartos}"/>
                            </div>
                            <label class="col-sm-1 control-label">Salas</label>
                            <div class="col-sm-1">
                                <input type="text" class="form-control" th:field="*{ambiente.salas}"/>
                            </div>
                            <label class="col-sm-1 control-label">Garagens</label>
                            <div class="col-sm-1">
                                <input type="text" class="form-control" th:field="*{ambiente.garagens}"/>
                            </div>
                            <label class="col-sm-1 control-label">Banheiros</label>
                            <div class="col-sm-1">
                                <input type="text" class="form-control" th:field="*{ambiente.banheiros}"/>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">Cadastrar</button>
                    </div>
                </div>
            </div>
        </div>
    </form>
</section>
    
</html>
