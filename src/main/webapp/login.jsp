<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Se connecter</title>

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

		<!-- Sing in  Form -->
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
					<div class="signin-image">
						<figure>
							<img src="images/img20.jpg" alt="sing up image" style="width: 100%">
						</figure>
						<a href="inscription.jsp" class="signup-image-link">Cr�er un compte</a>
					</div>

					<div class="signin-form">
						<h2 class="form-title">Se connecter</h2>
						<form method="" action="login" class="register-form"
							id="login-form">
							<div class="form-group">
								<label for="pays"><i
									class="zmdi zmdi-account material-icons-userole"></i></label>
                                   <input type="text" list="role-list" name="role" placeholder="Your role" id="role" />

                                        <datalist id="role-list">
                                         <option value="Abonn�">
                                          <option value="Coach">
                                           <option value="Admin">
                                           </datalist>	
							</div>
							<div class="form-group">
								<label for="username"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="username" id="username"
									placeholder="Your Name" />
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="password" id="password"
									placeholder="Password" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="remember-me" id="remember-me"
									class="agree-term" /> <label for="remember-me"
									class="label-agree-term"><span><span></span></span>Se souvenir
									</label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="Connectez-vous" />
							</div>
						</form>
						<div class="social-login">
							<span class="social-label">Nos r�seaux sociaux</span>
							<ul class="socials">
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-facebook"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-twitter"></i></a></li>
								<li><a href="#"><i
										class="display-flex-center zmdi zmdi-google"></i></a></li>
							</ul>
						</div>
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

    if(status == "failed"){

        swal("D�sol�!", "Vos identifiants ne correspondent pas", "error");
        document.getElementById("status").value;
        }
    </script>
</body>
</html>