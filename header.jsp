<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type = "text/css">
		body {
			margin: 0;
			padding: 0;
			overflow: hidden;
			height: 100%; 
			max-height: 100%; 
			font-family:Sans-serif;
			line-height: 1.5em;
		}
		#header {
			position: absolute;
			top: 0;
			left: 0;
			width: 100%;
			height: 60px; 
			overflow: hidden; 
			background: #00B2B2;
		}
		
		.center {
   			position :absolute;
   			left:1250px;
   			top:0px;
   			width: 10%;
    		
		}
		.button {
  padding: 10px 25px;
  font-size: 24px;
  text-align: center;
  cursor: pointer;
  outline: none;
  color: #fff;
  background-color: black;
  border: none;
  border-radius: 0px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: black}

.button:active {
  background-color: black;
  box-shadow: 0 5px #666;
  
}
		.logo {
			position:absolute;
			top:15px;
			left:15px;
			align:auto;
		}
		
</style>

</head>
<body>
<header id="header">
	 	<div class = "logo">
			<font size="5" face="Georgia">Welcome <%=session.getAttribute("userName")%>,</font>
		</div>
			<div class = "center">
			<button class = "button" onClick = "window.top.location.href='index.html'" >Logout</button>
			</div>
</header>
</body>
</html>