package com.mbk.learning;

sealed interface OnlineClassTutorialsInterface permits SubscribedPremiumUsers {
    void getTutorials();
}

final class SubscribedPremiumUsers implements OnlineClassTutorialsInterface {
    public void getTutorials() {
        System.out.println("Subscribed users can access all tutorials.");
    }
}

final class UnSubscribedUsers{
    public void getTutorials() {
        System.out.println("Unsubscribed users cannot access any tutorials.");
    }
}

sealed class OnlineClassTutorialsClass permits SubscribedRegularUSers {
     
}

non-sealed class SubscribedRegularUSers extends OnlineClassTutorialsClass {
    public void getTutorials() {
        System.out.println("Subscribed users can access few tutorials.");
    }
}

public class SealedDemo {

    public static void main(String[] args) {
        OnlineClassTutorialsInterface onlineClassTutorials = new SubscribedPremiumUsers();
        onlineClassTutorials.getTutorials();
        
        UnSubscribedUsers unSubscribedUsers = new UnSubscribedUsers();
        unSubscribedUsers.getTutorials();

        SubscribedRegularUSers subscribedRegularUSers = new SubscribedRegularUSers();
        subscribedRegularUSers.getTutorials();
    }
}
