/***********************************************************************
 * Module:  Abonnement.java
 * Author:  GILBERT
 * Purpose: Defines the Class Abonnement
 ***********************************************************************/

import java.util.*;

/** @pdOid 66f7caa0-d107-4ea5-afef-52735c665b7e */
public class Abonnement {
   /** @pdOid 7e4b2d4e-a258-4fd2-82b7-6ed2127dce19 */
   private int idAbonnement;
   /** @pdOid ac8b09f2-3eac-42e3-bcc7-a8b2d04dba47 */
   private String typeAbonnement;
   /** @pdOid ae8a75a4-4249-4e1f-9218-56c064d710e0 */
   private Number tarif;
   
   /** @pdRoleInfo migr=no name=Utilisateurs assc=souscire mult=1..1 side=A */
   public Utilisateurs utilisateurs;
   /** @pdRoleInfo migr=no name=SalleDeSport assc=permettreAcces mult=1..1 side=A */
   public SalleDeSport salleDeSport;
   
   /** @pdOid e5056688-d067-4c77-939c-782bcc143ae5 */
   public String ajouterAbonnement() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid fbec0043-545c-497a-9073-605f59d028da */
   public String modifierAbonnement() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 55736a4a-ae9a-4be6-ba53-767fa7ddd75e */
   public String supprimerAbonnement() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 22153dd0-1e1b-4666-8851-bafe6265eb2f */
   public String voirSalleDeSport() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid cf5c2ade-4567-4f8b-b026-2a932c6b2629 */
   public String voirTarif() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 2978c083-b21f-4456-b284-6867d5fd088b */
   public String getTypeAbonnement() {
      return typeAbonnement;
   }
   
   /** @param newTypeAbonnement
    * @pdOid 5ee3a4b5-a618-42bf-bd43-11dbb67709b5 */
   public void setTypeAbonnement(String newTypeAbonnement) {
      typeAbonnement = newTypeAbonnement;
   }
   
   /** @pdOid efbe9617-3d20-4d05-bdee-6636bf32d55d */
   public Number getTarif() {
      return tarif;
   }
   
   /** @param newTarif
    * @pdOid 951a7d0f-d17c-4be6-aa61-fa7c82f3b5a5 */
   public void setTarif(Number newTarif) {
      tarif = newTarif;
   }
   
   
   /** @pdGenerated default parent getter */
   public Utilisateurs getUtilisateurs() {
      return utilisateurs;
   }
   
   /** @pdGenerated default parent setter
     * @param newUtilisateurs */
   public void setUtilisateurs(Utilisateurs newUtilisateurs) {
      if (this.utilisateurs == null || !this.utilisateurs.equals(newUtilisateurs))
      {
         if (this.utilisateurs != null)
         {
            Utilisateurs oldUtilisateurs = this.utilisateurs;
            this.utilisateurs = null;
            oldUtilisateurs.removeAbonnement(this);
         }
         if (newUtilisateurs != null)
         {
            this.utilisateurs = newUtilisateurs;
            this.utilisateurs.addAbonnement(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public SalleDeSport getSalleDeSport() {
      return salleDeSport;
   }
   
   /** @pdGenerated default parent setter
     * @param newSalleDeSport */
   public void setSalleDeSport(SalleDeSport newSalleDeSport) {
      if (this.salleDeSport == null || !this.salleDeSport.equals(newSalleDeSport))
      {
         if (this.salleDeSport != null)
         {
            SalleDeSport oldSalleDeSport = this.salleDeSport;
            this.salleDeSport = null;
            oldSalleDeSport.removeAbonnement(this);
         }
         if (newSalleDeSport != null)
         {
            this.salleDeSport = newSalleDeSport;
            this.salleDeSport.addAbonnement(this);
         }
      }
   }

}