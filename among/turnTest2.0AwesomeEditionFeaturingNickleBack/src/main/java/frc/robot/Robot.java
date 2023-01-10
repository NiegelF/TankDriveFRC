

package frc.robot;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Victor;


public class Robot extends TimedRobot {


  Victor frontLeft = new Victor(1);
  Victor backleft = new Victor(2);
  Victor frontRight = new Victor(3);
  Victor backRight = new Victor(4);

  XboxController controller = new XboxController(0); // number might be different double check
  @Override
  public void robotInit() {

  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
    double rightControl = -controller.getLeftY();
    double leftControl = -controller.getRightY();
    double left = leftControl;
    double right = rightControl;
    left = left * .51;
    right = right * .5;
    frontLeft.set(right);
    backleft.set(right);
    backRight.set(-left);
    frontRight.set(-left);
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
