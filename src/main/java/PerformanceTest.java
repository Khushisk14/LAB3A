
public class PerformanceTest {
	

	    public static void main(String[] args) {

	        int iterations = 10000;

	        // StringBuffer Test
	        StringBuffer sbf = new StringBuffer();
	        long startBuffer = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            sbf.append("AIET");
	        }

	        long endBuffer = System.nanoTime();
	        long timeBuffer = endBuffer - startBuffer;

	        System.out.println("StringBuffer Time: " + timeBuffer + " ns");

	        // StringBuilder Test
	        StringBuilder sbd = new StringBuilder();
	        long startBuilder = System.nanoTime();

	        for (int i = 0; i < iterations; i++) {
	            sbd.append("AIET");
	        }

	        long endBuilder = System.nanoTime();
	        long timeBuilder = endBuilder - startBuilder;

	        System.out.println("StringBuilder Time: " + timeBuilder + " ns");

	        // Comparison
	        if (timeBuilder < timeBuffer) {
	            System.out.println("StringBuilder is faster than StringBuffer");
	        } else {
	            System.out.println("StringBuffer is faster than StringBuilder");
	        }
	    }
	}

