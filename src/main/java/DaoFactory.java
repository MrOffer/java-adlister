public class DaoFactory {
    private static Ads adsDao;
    private static Contacts ContactListDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

    public static Contacts getContactListDao(){
        if (ContactListDao == null){
            ContactListDao =  new ContactListDao();
        }
    return ContactListDao;
    }
}
