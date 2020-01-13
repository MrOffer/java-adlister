public class DaoFactory {
    private static Ads adsDao;
    private static Contacts ContactsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

    public static Contacts getContactsDao(){
        if (ContactsDao == null){
            ContactsDao =  new ContactListDao();
        }
    return ContactsDao;
    }
}
