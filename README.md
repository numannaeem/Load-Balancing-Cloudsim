# **A Performance Comparison of Load Balancing Algorithms on a Simulated Cloud**

The following load balancing algorithms are implemented:<br/>
➢ Round Robin Algorithm<br/>
➢ Threshold Based Algorithm<br/>
➢ Honey Bee Foraging Algorithm<br/>
➢ Ant Colony Optimization<br/>

To compare the performance of different algorithms under the same configurations on the following metrics using a cloud simulator:<br/>
➢ Server Response Time<br/>
➢ Data Center Processing Time<br/>

Tool used: **CloudAnalyst**<br/>
Language used: **Java**<br/>
Underlying framework: **CloudSim**<br/>

### Steps to run the program:
* Open the project in Eclipse IDE (Open Eclipse > File > Open Project From File System, then select the program folder)
* Run the main class (located in cloudsim.ext.gui.GuiMain)
* Once the program runs and CloudAnalyst opens:
  * Click on Configure Simulation > Load Configuration
  * Select cloudanalyst-config.sim (Located in the project root folder. You may copy and paste this file to Documents folder if required, for easier access)
  * Once completed, head over to the Advanced tab to change the Load Balancing policy (using the dropdown present at the bottom)
  * Click on "Done" and then Run Simulation.
  * View the results (Overall Response Time and Data Center Processing Time) and compare with other Load Balancing policies
