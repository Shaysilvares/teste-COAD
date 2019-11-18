<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cadastrar Solicitação</title>
    <spring:url var="css" value="/static/css/bootstrap.css"/>
    <link type="text/css" rel="stylesheet" href="${css}"/>
</head>
<body>
<div class="container">
    <h1>Cadastrar Solicitação</h1>
    <hr>
    <div>

		<spring:url value="/solicitacao/todas" var="home"/>
		<a class="btn btn-default" href="${home}">Home</a>
    </div>
    <hr>
    <div>
    	<spring:url value="/solicitacao/salvar" var="salvar"/>
        <form:form modelAttribute="solicitacao" action="${salvar}" method="post">
            <div class="form-group">
                <label for="titulo">Título: </label>
                <form:input path="titulo" class="form-control"/>   
            </div>
            <div class="form-group">
                <label for="tipo">Tipo: </label>
                <form:select path="tipo">
                	<form:options/>
                </form:select>    
            </div>
            <div class="form-group">
                <label for="descricao">Descrição: </label>
               <form:input path="descricao"  class="form-control"/>
            </div>          
            <div class="form-group">
                <label for="data">Dt. Solicitação: </label>
                <form:input path="data"  class="form-control" type="date"/>  
            </div> 
            <div class="form-group">
                <label for="status">Status: </label>
                <form:select path="status">
                	<form:options/>
                </form:select>    
            </div>
            
            <hr>
            <h5>Dados do Cliente</h5>
            <hr>
            
             <div class="form-group">
                <label for="nome">nome: </label>
                <form:input path="nome" class="form-control"/>   
            </div>
            
             <div class="form-group">
                <label for="email">E-mail: </label>
                <form:input path="email" class="form-control"/>   
            </div>
            
             <div class="form-group">
                <label for="telefone">Telefone: </label>
                <form:input path="telefone" class="form-control"/>   
            </div>
            
            <div class="form-group">
                <button type="submit" class="btn btn-primary">Confirmar</button>
            </div>
            
        </form:form>
    </div>
</div>
</body>
</html>