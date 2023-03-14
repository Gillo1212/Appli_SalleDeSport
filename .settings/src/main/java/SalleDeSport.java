/***********************************************************************
 * Module:  SalleDeSport.java
 * Author:  GILBERT
 * Purpose: Defines the Class SalleDeSport
 ***********************************************************************/

import java.util.*;

/** @pdOid d760a29a-0540-4f90-986f-8a93edbf0ddb */
public class SalleDeSport {
   /** @pdOid 5becccc4-5cd3-46f6-b484-17f06aeebdf1 */
   private int idSalleDeSpot;
   /** @pdOid cb793960-94d6-4833-9bb7-8cf7a3917e1f */
   private String nomSalle;
   /** @pdOid 22b14117-dc98-4a0a-8c9e-d790d2f79338 */
   private String adresse;
   /** @pdOid ee83720f-312a-4861-9f8f-f6a4d7249576 */
   private Date heureOverture;
   /** @pdOid 784ebddb-1c42-4f22-bb70-4b50701d6e1e */
   private Number tarif;
   
   /** @pdRoleInfo migr=no name=Sport assc=proposer coll=java.util.Collection impl=java.util.HashSet mult=* */
   public java.util.Collection<Sport> sport;
   /** @pdRoleInfo migr=no name=Abonnement assc=permettreAcces coll=java.util.Collection impl=java.util.HashSet mult=* */
   public java.util.Collection<Abonnement> abonnement;
   /** @pdRoleInfo migr=no name=Reservation assc=posseder mult=* side=A */
   public Reservation[] reservation;
   
   /** @pdOid 366a93f0-c103-4d32-8806-7992fc4f7f4f */
   public String ajouterSalle() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid cd7c73dc-f4ed-4852-908a-9182625bfa65 */
   public String modifierSalle() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 6ac51217-5906-49e9-863c-8ff1955e9a54 */
   public String supprimerSalle() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 306f7c5d-dba9-4825-ba1f-d87224e86466 */
   public String voirSports() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 737d7d84-98b2-4e2e-99d5-569500ed3607 */
   public String voirTarif() {
      // TODO: implement
      return null;
   }
   
   /** @param newNomSalle
    * @pdOid 0c28a7d8-390d-4ce8-bb21-ffa42d39962f */
   public void setNomSalle(String newNomSalle) {
      nomSalle = newNomSalle;
   }
   
   /** @pdOid e20316e2-db78-4a2e-a792-6b8dfaced212 */
   public String getAdresse() {
      return adresse;
   }
   
   /** @param newAdresse
    * @pdOid 0f7cb875-a0b7-4313-8103-6ff96bf845d2 */
   public void setAdresse(String newAdresse) {
      adresse = newAdresse;
   }
   
   /** @pdOid 22698fe9-ba24-440f-831c-b48c9298cb96 */
   public Date getHeureOverture() {
      return heureOverture;
   }
   
   /** @param newHeureOverture
    * @pdOid 30017595-2e13-4716-8139-03d3fa0f9bab */
   public void setHeureOverture(Date newHeureOverture) {
      heureOverture = newHeureOverture;
   }
   
   /** @pdOid 809d291d-1375-416c-abca-092baa708be0 */
   public Number getTarif() {
      return tarif;
   }
   
   /** @param newTarif
    * @pdOid 36ce3f64-729f-4ffb-954c-216761c8d845 */
   public void setTarif(Number newTarif) {
      tarif = newTarif;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Sport> getSport() {
      if (sport == null)
         sport = new java.util.HashSet<Sport>();
      return sport;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSport() {
      if (sport == null)
         sport = new java.util.HashSet<Sport>();
      return sport.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSport */
   public void setSport(java.util.Collection<Sport> newSport) {
      removeAllSport();
      for (java.util.Iterator iter = newSport.iterator(); iter.hasNext();)
         addSport((Sport)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSport */
   public void addSport(Sport newSport) {
      if (newSport == null)
         return;
      if (this.sport == null)
         this.sport = new java.util.HashSet<Sport>();
      if (!this.sport.contains(newSport))
         this.sport.add(newSport);
   }
   
   /** @pdGenerated default remove
     * @param oldSport */
   public void removeSport(Sport oldSport) {
      if (oldSport == null)
         return;
      if (this.sport != null)
         if (this.sport.contains(oldSport))
            this.sport.remove(oldSport);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSport() {
      if (sport != null)
         sport.clear();
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
         newAbonnement.setSalleDeSport(this);      
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
            oldAbonnement.setSalleDeSport((SalleDeSport)null);
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
            oldAbonnement.setSalleDeSport((SalleDeSport)null);
         }
      }
   }

}