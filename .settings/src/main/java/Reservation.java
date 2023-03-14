/***********************************************************************
 * Module:  Reservation.java
 * Author:  GILBERT
 * Purpose: Defines the Class Reservation
 ***********************************************************************/

import java.util.*;

/** @pdOid 286acc87-aabb-4196-bc5a-396a46aee7ad */
public class Reservation {
   /** @pdOid 47653163-77f0-4ee3-a2d9-a2aa01fc1d62 */
   private int idReservation;
   /** @pdOid 5a661016-1970-4fa3-9160-103a87dc4e52 */
   private Date dateHeure;
   /** @pdOid 5bb57b10-3126-4b46-a790-10d0cf894f16 */
   private int utilisateurId;
   /** @pdOid a02fa7ac-4b73-4c55-9f87-1e923d03a925 */
   private int salleId;
   /** @pdOid 03e27960-e688-4da7-8481-5e2bf4a15ecd */
   private int sportId;
   
   /** @pdRoleInfo migr=no name=Sport assc=concerne mult=1..1 */
   public Sport sport;
   /** @pdRoleInfo migr=no name=SalleDeSport assc=posseder mult=1..1 */
   public SalleDeSport salleDeSport;
   /** @pdRoleInfo migr=no name=Utilisateurs assc=effectuer mult=1..1 side=A */
   public Utilisateurs utilisateurs;
   
   /** @pdOid 21a5967c-0ceb-4966-a1db-63df8134e330 */
   public String affectuerResrvation() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 74222fe1-f4a8-44ec-a979-668578b7193e */
   public String annulerResevation() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 502cb3be-9281-42e2-82f0-ddaf49b3ceb7 */
   public String modifierReservation() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid f6414b2d-5ef9-480a-be7b-243c7594d136 */
   public String voirReservation() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 575185ee-5af1-493d-a995-b106712f1722 */
   public Date getDateHeure() {
      return dateHeure;
   }
   
   /** @param newDateHeure
    * @pdOid 419ad5b4-bbbf-4e33-8c58-6b07c7712884 */
   public void setDateHeure(Date newDateHeure) {
      dateHeure = newDateHeure;
   }

}