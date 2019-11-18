<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lista de Ususarios</title>
    <spring:url var="css" value="/static/css/bootstrap.css"/>
    <link type="text/css" rel="stylesheet" href="${css}"/>
</head>
<body>
<div class="container">
    <h1>Lista de Solicitações</h1>
    <hr>
    <div>

		<spring:url value="/solicitacao/cadastrar" var="cadastrar"/>
        <a class="btn btn-default" href="${cadastrar}">Nova Solicitação</a>
    </div>
    <hr>

        <div class="panel-heading">
            <span>${message == null ? '&nbsp;' : message}</span>
        </div>

        <table class="table table-striped table-condensed">
            <thead>
            <tr>
                <th>Título</th>
                <th>Tipo</th>
                <th>Descrição</th>
                <th>Dt. Solicitação </th>
                <th>Cliente</th>
                <th>Status</th>
                <th>Prioridade</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="solicitacao" items="${solicitacoes}">
                <tr>
                    <td>${solicitacao.titulo}</td>
                    <td>${solicitacao.tipo.descricao}</td>
                    <td>${solicitacao.descricao}</td>
                    <td>
                    	<f:formatDate value="${solicitacao.data}" pattern="dd/MM/yyyy" type="date"/>
                    </td>
                    <td>
	                    ${solicitacao.cliente.nome}
	                    ${solicitacao.cliente.email}
	                    ${solicitacao.cliente.telefone}
                    </td>
                   <td>${solicitacao.status}</td>
                   <td>${solicitacao.prioridade}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>