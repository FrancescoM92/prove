<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
	<div style="text-align: center;">
		LOGIN<br>
		<div style="text-align: left;">
			<table style="text-align: left; width: 380px; height: 119px;"
				border="1" cellpadding="2" cellspacing="2">
				<tbody>
					<tr>
						<td>
							<form action="LoginServlet" method="post">
								Username:
								<br> 
								<input name="username">
								<br>
								Password:
								<br> 
								<input type="password" name="password">
								<br> 
								<input type="submit" value="Accedi">		
							</form> <br>	
						</td>
					</tr>
				</tbody>
			</table><br><br>

			<table style="text-align: left; width: 380px; height: 219px;"
				border="1" cellpadding="2" cellspacing="2">
				<tbody>

					<tr>
						<td>
							<form action="RegServlet" method="post">
								REGISTRAZIONE NUOVO UTENTE:<br> <br>
								Username: <br>
								<input name= "username">
								<br> <br> 
								Password: <br>
								<input type="password" name="password"> <br>
								<br>
								Nome: <br>
								<input nome="nome"> <br>  
								Cognome: <br>
								<input name="cognome">
								<br> <br> 
								Indirizzo: <br>
								<input name = "indirizzo"><br> <br>
								<input type="submit" value="Resgistrati">
							</form>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>