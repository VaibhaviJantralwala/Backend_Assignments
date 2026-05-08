<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lab Exercise 1</title>
</head>
<body>

  <!-- NAVIGATION MENU - Anchor Tags -->
  <nav>
    <a href="#form">Form</a> |
    <a href="#table">Table</a> |
    <a href="#images">Images</a> |
    <a href="#lists">Lists</a>
  </nav>

  <hr>

  <!-- FORM -->
  <section id="form">
    <h2>User Registration Form</h2>
    <form action="#" method="post">
      <label for="name">Name:</label><br>
      <input type="text" id="name" name="name"><br><br>

      <label for="email">Email:</label><br>
      <input type="email" id="email" name="email"><br><br>

      <label for="course">Course:</label><br>
      <input type="text" id="course" name="course"><br><br>

      <input type="submit" value="Submit">
    </form>
  </section>

  <hr>

  <!-- TABLE -->
  <section id="table">
    <h2>Student Data</h2>
    <table border="1">
      <tr>
        <th>Roll No</th>
        <th>Name</th>
        <th>Marks</th>
      </tr>
      <tr>
        <td>101</td>
        <td>Aarav</td>
        <td>92</td>
      </tr>
      <tr>
        <td>102</td>
        <td>Priya</td>
        <td>87</td>
      </tr>
      <tr>
        <td>103</td>
        <td>Rohan</td>
        <td>78</td>
      </tr>
    </table>
  </section>

  <hr>

  <!-- IMAGES -->
  <section id="images">
    <h2>Images</h2>
    <img src="https://upload.wikimedia.org/wikipedia/en/3/30/Java_programming_language_logo.svg" 
         alt="Java logo" width="100">
    <img src="https://upload.wikimedia.org/wikipedia/commons/6/61/HTML5_logo_and_wordmark.svg" 
         alt="HTML5 logo" width="100">
  </section>

  <hr>

  <!-- LISTS -->
  <section id="lists">
    <h2>Unordered List</h2>
    <ul>
      <li>HTML</li>
      <li>CSS</li>
      <li>JavaScript</li>
    </ul>

    <h2>Ordered List</h2>
    <ol>
      <li>Plan</li>
      <li>Code</li>
      <li>Test</li>
      <li>Deploy</li>
    </ol>
  </section>

</body>
</html>