<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>S'inscrire</title>

<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="alert/dist/sweetalert.css">
</head>
<body>



<input type="hidden" id="status" value="<%= request.getAttribute("status")%>"/>

	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Inscription</h2>
					
						<form method="POST" action="inscription" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Your full name" />
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Your email" />
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="pass" id="pass" placeholder="Password" />
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re_pass" id="re_pass"
									placeholder="Repeat your password" />
							</div>
							<div class="form-group">
								<label for="Contact"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="number" name="contact" id="contact"
									placeholder="Numéro de tél" />
							</div>
							<div class="form-group">
								<label for="role"><i class="zmdi zmdi-account material-icons-userole"></i></label>
								<input type="text" name="role" id="role" value="Abonné" readonly>

							</div>
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>
									J'accepte les <a href="#" class="term-service">Termes de ce
					              service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="S'inscrire" />
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="images/img20.jpg" alt="sing up image">
						</figure>
						<a href="login.jsp" class="signup-image-link">Je suis déjà
							un membre</a>
					</div>
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    
    
    <script type="text/javascript">

    var status = document.getElementById("status").value;

    if(status == "succes"){

        swal("Félicitation!", "Votre compte a été créé avec success", "success");
        document.getElementById("status").value;
        }
    </script>

</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>