package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class CheckOut {
	public static boolean checkOut(double cart, int creditRating, statusClass.status status) {
	    boolean approved = false;

	    if (status == statusClass.status.GOLD) {
	        if (cart < 3_500.00) {
	            approved = true;
	        } else {
	            if (creditRating > 650) {
	                approved = true;
	            }
	        }
	    } else if (status == statusClass.status.SILVER) {
	        if (cart < 2_500.00) {
	            approved = true;
	        } else {
	            if (creditRating > 750) {
	                approved = true;
	            }
	        }
	    } else {
	        if (cart < 1_500.00) {
	            approved = true;
	        } else {
	            if (creditRating > 800) {
	                approved = true;
	            }
	        }
	    }
	    return approved;
	}

}
