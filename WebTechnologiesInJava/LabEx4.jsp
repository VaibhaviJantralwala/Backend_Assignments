<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LabEx 4</title>
 <style>

    body {
      font-family: Arial, sans-serif;
      background-color: #f0f0f0;
      padding: 20px;
    }

    /* ── NAVIGATION MENU ── */
    nav {
      background-color: #333;
      padding: 10px;
    }

    nav a {
      color: white;
      text-decoration: none;
      padding: 8px 16px;
      display: inline-block;
    }

    /* :hover - when mouse is over the link */
    nav a:hover {
      background-color: #ff6600;
      color: white;
    }

    /* :active - when link is being clicked */
    nav a:active {
      background-color: darkred;
    }

    /* :visited - after link has been visited */
    nav a:visited {
      color: lightgray;
    }

    /* ── FORM ── */
    form {
      margin-top: 30px;
      background-color: white;
      padding: 20px;
      border: 1px solid #ccc;
      width: 300px;
    }

    input, textarea {
      display: block;
      width: 100%;
      padding: 8px;
      margin-top: 6px;
      margin-bottom: 14px;
      border: 2px solid #ccc;
      font-size: 15px;
    }

    /* :focus - when input is clicked / selected */
    input:focus, textarea:focus {
      border-color: blue;
      background-color: lightyellow;
      outline: none;
    }

    /* :hover on input */
    input:hover, textarea:hover {
      border-color: orange;
    }

    /* button states */
    button {
      background-color: #333;
      color: white;
      padding: 10px 20px;
      border: none;
      cursor: pointer;
      font-size: 15px;
    }

    /* :hover on button */
    button:hover {
      background-color: #ff6600;
    }

    /* :active on button */
    button:active {
      background-color: darkred;
    }

    /* ── LIST - :first-child, :last-child ── */
    ul {
      margin-top: 30px;
      background: white;
      padding: 16px 30px;
      width: 300px;
      border: 1px solid #ccc;
    }

    li {
      padding: 6px 0;
      border-bottom: 1px solid #eee;
    }

    /* :first-child - first list item */
    li:first-child {
      color: green;
      font-weight: bold;
    }

    /* :last-child - last list item */
    li:last-child {
      color: red;
      border-bottom: none;
    }

    /* :hover on list item */
    li:hover {
      background-color: #f0f0f0;
      padding-left: 10px;
    }

  </style>
</head>
<body>

  <h2>CSS Pseudo-Class Demo</h2>

  <!-- NAVIGATION MENU -->
  <h3>1. Navigation Menu</h3>
  <nav>
    <a href="#">Home</a>
    <a href="#">About</a>
    <a href="#">Courses</a>
    <a href="#">Contact</a>
  </nav>
  <p><small>Hover over links to see :hover | Click to see :active</small></p>

  <!-- FORM with :focus -->
  <h3>2. Form Inputs</h3>
  <form>
    <label>Name:</label>
    <input type="text" placeholder="Click to see :focus">

    <label>Email:</label>
    <input type="email" placeholder="Click to see :focus">

    <label>Message:</label>
    <textarea rows="3" placeholder="Click to see :focus"></textarea>

    <button type="submit">Submit</button>
  </form>

  <!-- LIST with :first-child :last-child -->
  <h3>3. List — :first-child and :last-child</h3>
  <ul>
    <li>First item — :first-child (green)</li>
    <li>Middle item — hover me!</li>
    <li>Middle item — hover me!</li>
    <li>Last item — :last-child (red)</li>
  </ul>

</body>
</html>