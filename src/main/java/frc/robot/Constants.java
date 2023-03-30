package frc.robot;

public class Constants {
    /* General */
    //PDP and Pnuematic Hub CAN IDs
    public static final int PDP_ID = 1;
    public static final int PNUEMATIC_HUB_ID = 2;

    //Pneumatics
    public static final int DOUBLE_SOLENOID_LIFT_FWD = 1;
    public static final int DOUBLE_SOLENOID_LIFT_REV = 3;

    /* Claw */
    //Claw Motor CAN ID
    public static final int CLAW_MOTOR_ID = 9;

    /* Drivetrain */
    //Drive Motor CAN IDs
    public static final int LEFT_FRONT_DRIVE_MOTOR_ID = 3;
    public static final int LEFT_BACK_DRIVE_MOTOR_ID = 4;
    public static final int RIGHT_FRONT_DRIVE_MOTOR_ID = 5;
    public static final int RIGHT_BACK_DRIVE_MOTOR_ID = 6;

    //Invert Drive Motors
    public static final boolean LEFT_DRIVE_INVERTED = true;
    public static final boolean RIGHT_DRIVE_INVERTED = false;


    /* Extender */
    //Extender Motor CAN IDs
    public static final int EXTENDER_LEFT_MOTOR_ID = 7;
    public static final int EXTENDER_RIGHT_MOTOR_ID = 8;

    //Invert Extender Motors
    public static final boolean LEFT_EXTENDER_INVERTED = true;
    public static final boolean RIGHT_EXTENDER_INVERTED = false;

    public static final boolean EXTEDNER_MOTOR_BRAKE = true;

    //Extender Power Percentage
    public static final double EXTENDER_POWER_PERCENTAGE = 0.2; 

    //Extender Setpoints (revolutions)
    public static final double EXTENDER_START_POS = 0.0;
    public static final double EXTENDER_LOW_POS = 6.0;
    public static final double EXTENDER_MID_POS = 6.0;
    public static final double EXTENDER_HIGH_POS = 6.0;

    //Extender PID Values
        //KC = 2.0
        //PC = 0.14
        //KP = 0.6 * KC = 1.2
    public static final double EXTENDER_KP = 1.2;
        //KI = 2 * (KP / PC) = 17.1428571429
    public static final double EXTENDER_KI = 17.1428571429;
        //KD = 0.125 * KP * PC = 0.021
    public static final double EXTENDER_KD = 0.021;
    public static final double EXTENDER_TOLERANCE = 0.5;


    /* Control Systems */
    //Generic Key values
    private static final int L_X_AXIS = 0;
    private static final int L_Y_AXIS = 1;
    private static final int R_X_AXIS = 4;
    private static final int R_Y_AXIS = 5;
    private static final int L_TRIGGER = 2;
    private static final int R_TRIGGER = 3;

    private static final int A_BUTTON = 1;
    private static final int B_BUTTON = 2;
    private static final int X_BUTTON = 3;
    private static final int Y_BUTTON = 4;
    private static final int L_BUTTON = 5;
    private static final int R_BUTTON = 6;
    private static final int BACK_BUTTON = 7;
    private static final int START_BUTTON = 8;
    private static final int L_STICK_BUTTON = 9;
    private static final int R_STICK_BUTTON = 10;

    //Josiah Controller 
    public static final int J_CONTROLLER_PORT_ID = 0;
    public static final int J_CLAW_CLOSE_BUTTON = A_BUTTON;
    public static final int J_CLAW_OPEN_BUTTON = B_BUTTON;
    public static final int J_EXTENDER_LIFT_BUTTON = R_BUTTON;
    public static final int J_EXTEND_TRIGGER = R_TRIGGER;
    public static final int J_RETRACT_TRIGGER = L_TRIGGER;

    //Mason Controller
    public static final int M_CONTROLLER_PORT_ID = 1;
    public static final int M_RIGHT_VERTICAL_JOYSTICK_AXIS = R_Y_AXIS;
    public static final int M_RIGHT_HORIZONTAL_JOYSTICK_AXIS = R_X_AXIS;
    public static final int M_LEFT_VERTICAL_JOYSTICK_AXIS = L_Y_AXIS;
    public static final int M_LEFT_HORIZONTAL_JOYSTICK_AXIS = L_X_AXIS;
}
