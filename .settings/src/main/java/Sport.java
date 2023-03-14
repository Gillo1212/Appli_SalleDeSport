/***********************************************************************
 * Module:  Sport.java
 * Author:  GILBERT
 * Purpose: Defines the Class Sport
 ***********************************************************************/

import java.util.*;

/** @pdOid c8226d44-9d1c-4c94-9584-6907ff79ed45 */
public class Sport {
   /** @pdOid 4457fda3-8a3d-46d3-9c8b-40610930fff5 */
   private int idSport;
   /** @pdOid 37943e09-f5a1-47a7-8eb0-bbcbf9ec0e6c */
   private String nomSport;
   /** @pdOid d92c4581-cf18-40f0-9abc-d26c3261fcde */
   private String categorie;
   
   /** @pdRoleInfo migr=no name=SalleDeSport assc=proposer mult=* side=A */
   public SalleDeSport[] salleDeSport;
   /** @pdRoleInfo migr=no name=Reservation assc=concerne mult=* side=A */
   public Reservation[] reservation;
   
   /** @pdOid a8f78737-75ae-4538-ab5e-a9b7f66c5eb2 */
   public String ajouterSport() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid a85104ca-f9d3-455c-b40e-a413449d146a */
   public String modifierSport() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 4b0f1160-2872-4554-a218-43d1acd1c84a */
   public String supprimerSport() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 817edf38-76f9-418b-b1e4-b14fa23de111 */
   public String voirSalleDeSport() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 55db34ea-b6b7-4610-a819-1257e9b03a79 */
   public String getNomSport() {
      return nomSport;
   }
   
   /** @param newNomSport
    * @pdOid badcfe89-388d-4579-98bb-fe00b4dabb88 */
   public void setNomSport(String newNomSport) {
      nomSport = newNomSport;
   }
   
   /** @pdOid 1f2bed15-d3f4-4452-9b57-4ac25546189f */
   public String getCategorie() {
      return categorie;
   }
   
   /** @param newCategorie
    * @pdOid 20209535-e432-423b-9aac-7b595a5b07ae */
   public void setCategorie(String newCategorie) {
      categorie = newCategorie;
   }

}