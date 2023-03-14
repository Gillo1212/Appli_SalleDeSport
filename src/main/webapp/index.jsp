<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Tangerine|Poppins|Inconsolata|Droid+Sans|Montserrat|Roboto|OpenSans">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
     <link rel="stylesheet" href="Acceuil.css">
    <title>Univers Sport</title>
  </head>
  <body>
    

  <!-- Navbar -->
    <nav class="navbar navbar-expand-lg ">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Univers Sports <br> <span>Sports for health</span></a>
      <button class="navbar-toggler text-dark" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation text-dark">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav me-auto">
          <li class="nav-item">
            <a class="nav-link" href="#slide">Accueil</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#main">A propos</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#contact">Contact</a>
          </li>
        </ul>
        <ul class="navbar-nav">
          <li class="nav-item tiktak">
            <a class="nav-link" href="login.jsp">Sign up<i class="fa-solid fa-user"></i> </a>
          </li>
        
        </ul>
         </div>
        </div>
    </nav>

    <!-- Jumbotron -->
    <div class="jumbotron jumbotron-fluid">
        <div class="container">
            <h1 class="display-4">Trouvez votre salle de sport idéale</h1>
            <p class="lead">Notre application de gestion et d'inscription à des salles de sport vous permet de trouver la salle de sport qui convient le mieux à vos besoins et à vos objectifs de remise en forme.</p>
            <a class="btn btn-primary btn-lg" href="inscription.jsp" role="button">S'inscrire maintenant</a>
        </div>
    </div>

    <!-- Section des salles de sport -->
    <section class="container" id="slide">
        <h2>Nos salles de sport</h2>
        <div class="row">
            <div class="col-md-4 mb-4">
                <div class="card">
                    <img src="images/img14.jpg" class="card-img-top" alt="..." style="">
                    <div class="card-body">
                        <h5 class="card-title">Salle de sport 1</h5>
                        <p class="card-text">Description de la salle de sport 1</p>
                        <a href="#" class="btn btn-primary">En savoir plus</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4 mb-4">
                <div class="card">
                   <img src="images/img15.jpg" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">Salle de sport 1</h5>
                        <p class="card-text">Description de la salle de sport 1</p>
                        <a href="#" class="btn btn-primary">En savoir plus</a>
                      </div>
                      </div>
                      </div>
                       <div class="col-md-4 mb-4">
                <div class="card">
                   <img src="images/img3.jpg" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">Salle de sport 1</h5>
                        <p class="card-text">Description de la salle de sport 1</p>
                        <a href="#" class="btn btn-primary">En savoir plus</a>
                      </div>
                      </div>
                      </div>
                       
                       </div>

                         </section>
<section class="about-us" id="main">
  <div class="container">
    <div class="row">
      <div class="col-lg-6">
        <h2>À propos de nous</h2>
        <p>Nous sommes une entreprise spécialisée dans la gestion et l'inscription à des salles de sport. Nous offrons une variété de sports, allant de la musculation au yoga, en passant par la natation et le basketball.</p>
        <p>Nous sommes fiers d'avoir des coaches professionnels qui sont disponibles pour évaluer les compétences de nos utilisateurs et créer des plans d'entraînement personnalisés pour les aider à atteindre leurs objectifs.</p>
        <p>Nous offrons également une plateforme pour que nos utilisateurs puissent échanger des conseils et discuter de différents domaines du sport.</p>
      </div>
      <div class="col-lg-6">
        <div class="row">
          <div class="col-md-6 col-lg-12 mb-4">
            <img src="images/img6.jpg" alt="Salle de musculation" class="img-fluid" style="width: 100%">
          </div>
          
        </div>
      </div>
    </div>
  </div>
</section>

<section class="testimonials">
  <div class="container">
    <h2>Témoignages</h2>
    <div class="row">
      <div class="col-lg-4">
        <div class="card">
          <div class="card-body">
            <p class="card-text">"J'adore cette salle de sport ! Le personnel est sympathique et les équipements sont de haute qualité. Je recommande fortement."</p>
            <h5 class="card-title">Julie</h5>
            <p class="card-subtitle">Membre depuis 6 mois</p>
          </div>
        </div>
      </div>
      <div class="col-lg-4">
        <div class="card">
          <div class="card-body">
            <p class="card-text">"Je suis impressionné par le niveau de compétence des coaches. Ils m'ont aidé à atteindre mes objectifs en un temps record."</p>
            <h5 class="card-title">Lucas</h5>
            <p class="card-subtitle">Membre depuis 1 an</p>
          </div>
        </div>
      </div>
      <div class="col-lg-4">
        <div class="card">
          <div class="card-body">
            <p class="card-text">"Je suis nouveau dans le monde du sport et je suis content d'avoir choisi cette salle. Les coaches sont très accueillants et m'ont aidé à me sentir à l'aise."</p>
            <h5 class="card-title">Lucas</h5>
            <p class="card-subtitle">Membre depuis 1 an</p>
            </div>
            </div>
          </div>
           </div>
           </div>
           </section>
     <section>
    <div class="container mt-5">
  <div class="row">
    <div class="col-md-6">
      <h2>Rejoignez-nous dès maintenant</h2>
      <p>Nous serions ravis de vous accueillir dans l'une de nos salles de sport.</p>
      <a href="EspaceReservation.jsp" class="btn btn-primary">RESERVER ICI</a>
    </div>
    <div class="col-md-6">
      <img src="images/img12.jpg" alt="Haltères" class="img-fluid" style="width: 100%"">
    </div>
  </div>
</div>  
   </section>
     
     <div> <br></div>
    <footer class="bg-light text-center text-lg-start " id="contact">
  <div class="container p-4">
    <div class="row">


      <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
        <h5 class="text-uppercase">Liens rapides</h5>

        <ul class="list-unstyled mb-0">
          <li>
            <a href="#!" class="text-dark">Accueil</a>
          </li>
          <li>
            <a href="#!" class="text-dark">Nos salles de sport</a>
          </li>
          <li>
            <a href="#!" class="text-dark">Nos coachs sportifs</a>
          </li>
          <li>
            <a href="#!" class="text-dark">Nous contacter</a>
          </li>
          <li>
           <a href="#!" class="mb-3" id="slide"> <img alt="" src="images/logo.png" style="width: 50%"></a>
          </li>
        </ul>
      </div>

      <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
        <h5 class="text-uppercase mb-0">Suivez-nous</h5>

        <ul class="list-unstyled me-auto align-items-center">
          <li>
            <a href="#!" class=""><i class="fab fa-facebook fa-2x"></i></a>
          </li>
          <li>
            <a href="#!" class=""><i class="fab fa-twitter fa-2x"></i></a>
          </li>
          <li>
            <a href="#!" class=""><i class="fab fa-google-plus fa-2x"></i></a>
          </li>
          <li>
            <a href="#!" class=""><i class="fab fa-instagram fa-2x"></i></a>
          </li>
        </ul>
      </div>
            <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
        <h5 class="text-uppercase">Contactez-nous</h5>

       <form class="#">
  <div class=" mb-3">
    <label for="email" class="form-label">Adresse e-mail</label>
    <input type="email" class="form-control" id="email" required>
  </div>
  <div class=" mb-3">
    <label for="message" class="form-label">Message</label>
    <textarea class="form-control" id="message" rows="1" required></textarea>
  </div>
  <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="newsletter">
    <label class="form-check-label" for="newsletter">S'inscrire à la newsletter</label>
  </div>
  <button type="submit" class="btn btn-primary">Envoyer</button>
</form>
       
      </div>
    </div>
  </div>

  <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
    © 2023 Tous droits réservés : <a class="text-dark" href="#">Univers Sports</a>
  </div>
</footer>
    
    
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>