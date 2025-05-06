package testng;

import org.testng.annotations.Test;

public class AlphaPriority {
    public class NegativePriority {
        @Test(priority = 'z')
        public void verifyCaseA() {
            System.out.println("Verify case A");
        }

        @Test(priority = 'b')
        public void verifyCaseQ() {
            System.out.println("Verify case Q");
        }

        @Test(priority = 'q')
        public void verifyCaseC() {
            System.out.println("Verify case C");
        }

        @Test(priority = 'w')
        public void verifyCaseZ() {
            System.out.println("Verify case Z");
        }

        @Test(priority = 'g')
        public void verifyCaseB() {
            System.out.println("Verify case B");
        }
    }
}
