package cloudsim.ext;

/**
 * Interface GeoLocatable should be implemented by any simulation entity that can be physically located
 * within a region of the Simulation World.
 * 
 * @author Numan Naeem
 *
 */
public interface GeoLocatable {

	int getRegion();
	
	String get_name();
}
