// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Compressor;

public class Pneumatics extends SubsystemBase {

  public DoubleSolenoid piston;
  public Compressor compressor;
  /** Creates a new Pneumatics. */
  public Pneumatics(DoubleSolenoid piston, Compressor compressor) {
    this.piston = piston;
    this.compressor = compressor;

  }

  public void forward(){
    piston.set(DoubleSolenoid.Value.kForward);
  }  

  public void reverse(){
    piston.set(DoubleSolenoid.Value.kReverse);
  }

  public void toggle(){
    piston.toggle();
  }

  public void off(){
    piston.set(DoubleSolenoid.Value.kOff);
  }

  public DoubleSolenoid getDoubleSolenoid(){
    return piston;
  }

  public Compressor getCompressor(){
    return compressor;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
