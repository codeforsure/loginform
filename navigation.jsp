<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style type="text/css">
		body {
			margin: 0;
			padding: 0;
			overflow: hidden;
			height: 100%; 
			max-height: 100%; 
			font-family:Sans-serif;
			line-height: 1.5em;
		}
		#nav {
			position: absolute; 
			top: 0; 
			left: 0; 
			bottom: 0;
			width: 230px;
			overflow: auto; 
			background: #595959; 		
		}
		.innertube {
			margin: 15px; /* Provides padding for the content */
		}
		p {
			color: #555;
		}
		nav ul {
			list-style-type: none;
			margin: 0;
			padding: 0;
		}
		nav ul a {
			color: #FFFFFF;
			text-decoration: none;
		}
		h1{
			color: #FFFFFF;
		}
		</style>
</head>
<body>
		<nav id="nav">
			<div class="innertube">
				
				<h1>Heading</h1>
				<ul>
					<li><a href="index.html" target="mainarea">Link 1</a></li>
					<li><a href="register.html" target = "mainarea">Link 2</a></li>
					<li><a href="#">Link 3</a></li>
					<li><a href="#">Link 4</a></li>
					<li><a href="#">Link 5</a></li>
				</ul>
				<h1>Heading</h1>
				<ul>
					<li><a href="#">Link 1</a></li>
					<li><a href="#">Link 2</a></li>
					<li><a href="#">Link 3</a></li>
					<li><a href="#">Link 4</a></li>
					<li><a href="#">Link 5</a></li>
				</ul>
				<h1>Heading</h1>
				<ul>
					<li><a href="#">Link 1</a></li>
					<li><a href="#">Link 2</a></li>
					<li><a href="#">Link 3</a></li>
					<li><a href="#">Link 4</a></li>
					<li><a href="#">Link 5</a></li>
				</ul>
				<h1>Heading</h1>
				<ul>
					<li><a href="#link1">Link 1</a></li>
					<li><a href="#link2">Link 2</a></li>
					<li><a href="#">Link 3</a></li>
					<li><a href="#">Link 4</a></li>
					<li><a href="#">Link 5</a></li>
				</ul>
			</div>
		</nav>	
</body>
</html>