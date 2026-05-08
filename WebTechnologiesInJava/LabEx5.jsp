<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LabEx 5</title>
<style>

    /* ID selector - unique */
    #title {
      color: blue;
      text-align: center;
    }

    /* Class selector - reusable */
    .highlight {
      background-color: yellow;
      padding: 5px;
    }

  </style>
</head>
<body>

  <!-- ID - only on one element -->
  <h1 id="title">This is styled using ID</h1>

  <!-- Class - same style on multiple elements -->
  <p class="highlight">Paragraph 1 - using class</p>
  <p class="highlight">Paragraph 2 - using class</p>
  <p class="highlight">Paragraph 3 - using class</p>
  
</body>
</html>