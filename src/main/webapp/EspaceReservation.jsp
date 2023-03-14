<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Réservation</title>
  </head>
  <body>
    

  <div class="container">
  <div class="row">
    <div class="col-md-8 offset-md-2 mt-4 bg-secondary" style="height: 75vh;">
      <div class="shadow p-3 mb-5 bg-body rounded">
       
       <h1 class="text-center mb-5">Réservation de salle de sport</h1>
        <form>
            <div class="row mb-3">
                <label for="date" class="col-sm-2 col-form-label">Date :</label>
                <div class="col-sm-10">
                    <input type="date" class="form-control" id="date">
                </div>
            </div>
            <div class="row mb-3">
                <label for="heureDebut" class="col-sm-2 col-form-label">H de début :</label>
                <div class="col-sm-4">
                    <input type="time" class="form-control" id="heureDebut">
                </div>
                <label for="heureFin" class="col-sm-2 col-form-label">H de fin :</label>
                <div class="col-sm-4">
                    <input type="time" class="form-control" id="heureFin">
                </div>
            </div>
            <div class="row mb-3">
                <label for="salle" class="col-sm-3 col-form-label">Salle :</label>
                <div class="col-sm-9">
                    <select class="form-select" id="salle">
                        <option selected disabled>Choisir une salle</option>
                        <option value="salle1">Salle 1</option>
                        <option value="salle2">Salle 2</option>
                        <option value="salle3">Salle 3</option>
                    </select>
                </div>
            </div>
           <div class="row mb-3">
                <label for="salle" class="col-sm-3 col-form-label">Sport :</label>
                <div class="col-sm-9">
                    <select class="form-select" id="salle">
                        <option selected disabled>Choisir un sport</option>
                        <option value="salle1">Sport 1</option>
                        <option value="salle2">Sport 2</option>
                        <option value="salle3">Sport 3</option>
                    </select>
                </div>
            </div>
            <div class="row mb-3">
                <label for="salle" class="col-sm-3 col-form-label">Type séance :</label>
                <div class="col-sm-9">
                    <select class="form-select" id="salle">
                        <option selected disabled>Séance</option>
                        <option value="salle1">séance 1</option>
                        <option value="salle2">séance 2</option>
                        <option value="salle3">séance3</option>
                    </select>
                </div>
            </div>
             <div class="row mb-3">
                <label for="salle" class="col-sm-3 col-form-label">Tarif séance :</label>
                <div class="col-sm-9">
                    <select class="form-select" id="salle">
                        <option selected disabled>Tarif séance</option>
                        <option value="salle1">Tarif 1</option>
                        <option value="salle2">Tarif 2</option>
                        <option value="salle3">Tarif 3</option>
                    </select>
                </div>
            </div>
            <div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit btn-primary" value="Réservez" />
							</div>       
           </form>
      </div>
    </div>
  </div>
</div>
  

    
                        
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>