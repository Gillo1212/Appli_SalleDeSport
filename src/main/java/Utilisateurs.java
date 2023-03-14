/***********************************************************************
 * Module:  Utilisateurs.java
 * Author:  GILBERT
 * Purpose: Defines the Class Utilisateurs
 ***********************************************************************/

import java.util.*;

/** @pdOid 5c4ff322-039c-40ad-9d1e-4d13ddc1c5f0 */
public class Utilisateurs {
   /** @pdOid 80bfd724-c9ef-4564-9556-a83ef1c0f3ce */
   private int idUtilisateur;
   /** @pdOid 3da1adf1-c0cf-4b34-923a-c09687e8ef93 */
   private String nom;
   /** @pdOid f8985a6b-d2b4-47bd-9b73-da21d19f1d76 */
   private String prenom;
   /** @pdOid bd236186-9e59-4c77-85c4-ccb377b57c10 */
   private String email;
   /** @pdOid a8af0261-fa88-4270-a45f-e8a74a417a52 */
   private String motDePasse;
   /** @pdOid 535e93fd-0207-4075-b20e-ecc0947ddc48 */
   private java.lang.String role;
   
   /** @pdRoleInfo migr=no name=Abonnement assc=souscire coll=java.util.Collection impl=java.util.HashSet mult=* */
   public java.util.Collection<Abonnement> abonnement;
   /** @pdRoleInfo migr=no name=Reservation assc=effectuer mult=* */
   public Reservation[] reservation;
   
   /** @pdOid 1cd348a6-4194-414d-a9fb-b996602fc264 */
   public String creerCompte() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 3ac901b5-c61e-40a4-b515-46ad32377834 */
   public String seconnecter() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid fb690d58-ace7-4887-adfa-297877b90a6f */
   public String modifierInfos() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid e3a1dedb-bc89-4050-b215-e37163998043 */
   public String supprimerCompte() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 7a9f1c1b-0433-4727-8747-5374598c31e0 */
   public String voirResrvations() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 14a996a4-029f-4ba3-b643-27a38c133088 */
   public String getNom() {
      return nom;
   }
   
   /** @param newNom
    * @pdOid 628a3e38-002e-4061-84a0-d3ad2bb8a037 */
   public void setNom(String newNom) {
      nom = newNom;
   }
   
   /** @pdOid 17a416cb-7ad2-458f-81c4-665987d750be */
   public String getPrenom() {
      return prenom;
   }
   
   /** @param newPrenom
    * @pdOid fcc00671-d51d-48fa-bf18-26f21f21738e */
   public void setPrenom(String newPrenom) {
      prenom = newPrenom;
   }
   
   /** @pdOid afb3bdf5-eb5c-4c29-bb66-810d61e619eb */
   public String getEmail() {
      return email;
   }
   
   /** @param newEmail
    * @pdOid 8f129714-9589-4715-b0f1-6ea0060fbb73 */
   public void setEmail(String newEmail) {
      email = newEmail;
   }
   
   /** @pdOid 20ea432b-d874-4440-9734-c1480c0a70a2 */
   public String getMotDePasse() {
      return motDePasse;
   }
   
   /** @param newMotDePasse
    * @pdOid 63dc5af2-5d02-4747-b635-16f9b72a23f5 */
   public void setMotDePasse(String newMotDePasse) {
      motDePasse = newMotDePasse;
   }
   
   /** @pdOid 0e37bcce-1e36-45c8-bb3d-990fb1145a55 */
   public java.lang.String getRole() {
      return role;
   }
   
   /** @param newRole
    * @pdOid e8b712b7-5913-484e-8761-294be1530a8c */
   public void setRole(java.lang.String newRole) {
      role = newRole;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Abonnement> getAbonnement() {
      if (abonnement == null)
         abonnement = new java.util.HashSet<Abonnement>();
      return abonnement;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAbonnement() {
      if (abonnement == null)
         abonnement = new java.util.HashSet<Abonnement>();
      return abonnement.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAbonnement */
   public void setAbonnement(java.util.Collection<Abonnement> newAbonnement) {
      removeAllAbonnement();
      for (java.util.Iterator iter = newAbonnement.iterator(); iter.hasNext();)
         addAbonnement((Abonnement)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAbonnement */
   public void addAbonnement(Abonnement newAbonnement) {
      if (newAbonnement == null)
         return;
      if (this.abonnement == null)
         this.abonnement = new java.util.HashSet<Abonnement>();
      if (!this.abonnement.contains(newAbonnement))
      {
         this.abonnement.add(newAbonnement);
         newAbonnement.setUtilisateurs(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldAbonnement */
   public void removeAbonnement(Abonnement oldAbonnement) {
      if (oldAbonnement == null)
         return;
      if (this.abonnement != null)
         if (this.abonnement.contains(oldAbonnement))
         {
            this.abonnement.remove(oldAbonnement);
            oldAbonnement.setUtilisateurs((Utilisateurs)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAbonnement() {
      if (abonnement != null)
      {
         Abonnement oldAbonnement;
         for (java.util.Iterator iter = getIteratorAbonnement(); iter.hasNext();)
         {
            oldAbonnement = (Abonnement)iter.next();
            iter.remove();
            oldAbonnement.setUtilisateurs((Utilisateurs)null);
         }
      }
   }

}