<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LabEx 3</title>
<head>
  <style>

    body {
      background-color: #f0f0f0;
      font-family: Arial, sans-serif;
    }

    h2 {
      text-align: center;
    }

    /* MARGIN DEMO */
    .box-no-margin {
      background-color: lightcoral;
      border: 2px solid red;
      margin: 0px; /* no margin */
    }

    .box-with-margin {
      background-color: lightcoral;
      border: 2px solid red;
      margin: 30px; /* space OUTSIDE the element */
    }

    /* PADDING DEMO */
    .box-no-padding {
      background-color: lightblue;
      border: 2px solid blue;
      padding: 0px; /* no padding */
    }

    .box-with-padding {
      background-color: lightblue;
      border: 2px solid blue;
      padding: 30px; /* space INSIDE the element */
    }

    /* MARGIN SIDES - top right bottom left */
    .box-margin-sides {
      background-color: lightyellow;
      border: 2px solid orange;
      margin-top: 10px;
      margin-right: 50px;
      margin-bottom: 10px;
      margin-left: 50px;
    }

    /* PADDING SIDES */
    .box-padding-sides {
      background-color: lightgreen;
      border: 2px solid green;
      padding-top: 5px;
      padding-right: 40px;
      padding-bottom: 5px;
      padding-left: 40px;
    }

    /* BOTH MARGIN AND PADDING TOGETHER */
    .box-both {
      background-color: plum;
      border: 2px solid purple;
      margin: 20px;
      padding: 20px;
    }

  </style>
</head>
<body>

  <h2>Margin and Padding Demo</h2>

  <!-- MARGIN DEMO -->
  <h3>1. No Margin vs With Margin</h3>

  <div class="box-no-margin">
    This box has margin: 0px (no space outside)
  </div>

  <div class="box-with-margin">
    This box has margin: 30px (space outside the border)
  </div>

  <!-- PADDING DEMO -->
  <h3>2. No Padding vs With Padding</h3>

  <div class="box-no-padding">
    This box has padding: 0px (text touches the border)
  </div>

  <div class="box-with-padding">
    This box has padding: 30px (space between text and border)
  </div>

  <!-- MARGIN SIDES -->
  <h3>3. Different Margin on Each Side</h3>

  <div class="box-margin-sides">
    margin-top: 10px | margin-right: 50px | margin-bottom: 10px | margin-left: 50px
  </div>

  <!-- PADDING SIDES -->
  <h3>4. Different Padding on Each Side</h3>

  <div class="box-padding-sides">
    padding-top: 5px | padding-right: 40px | padding-bottom: 5px | padding-left: 40px
  </div>

  <!-- BOTH TOGETHER -->
  <h3>5. Margin and Padding Together</h3>

  <div class="box-both">
    This box has both margin: 20px (outside) and padding: 20px (inside)
  </div>

</body>
</html>