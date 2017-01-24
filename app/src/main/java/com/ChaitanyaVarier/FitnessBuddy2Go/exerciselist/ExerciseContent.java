package com.ChaitanyaVarier.FitnessBuddy2Go.exerciselist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Exercise content class
 * <p>
 */
public class ExerciseContent {

	/**
	 * The array of exercises
	 */
	public static List<Exercise> ITEMS = new ArrayList<Exercise>();

	/**
	 * A map of exercises , by ID.
	 */
	public static Map<String, Exercise> ITEM_MAP = new HashMap<String, Exercise>();

	static {
		addItem(new Exercise ("1", "STRENGTH", "<big><b><font color=\"#FF0000\">Strength Exercises</font></b></big>" +
				"<P>The exercises under this category will make your muscles stronger. " +
				"They focus on strengthening your muscles which include your core muscles (abdominals, back and pelvic muscles), " +
				"arm muscles and leg muscles.</P>" +
				"<P>It is important to breathe deeply and steadily so that your muscles are supplied with sufficient oxygen " +
				"when performing these exercises.</P> " +
				"It is recommended to start off with <i><b>5-10 repetitions and two sets</b></i> in a workout for each of these exercises " +
				"and gradually increase to <i><b>20 repetitions and three sets</b></i> every day you engage in strength training. " +
				"<P>You can use a thin mat for comfort when performing exercises that require you to lie down." +
				"<b><font color=\"#FF0000\"> If you have any serious medical conditions, do not attempt any of the exercises without seeing a physician or doctor. " +
				"Do not attempt these exercises any further " +
				"if you experience pain or aching in any part of your body.</font></b>" +
				"</P>"));
		
		addItem(new Exercise ("2", "Sit-Up", "<big><b><font color=\"#FF0000\">Sit-Up</font></b></big>" +
		        "<P>Step 1: Lie with your back to the ground and bend your knees at a right angle. Place your feet flat on the ground.</P>" +
				"<P>Step 2: Place your hands on opposing shoulders so that they are crossed over your chest, or" +
				" interlock them behind your head.</P>" +
				"<b><P><font color=\"#FF0000\">*Be careful not to push your head with your hands, as this can place strain on your neck*</font></b>" +
				"</P><img src =\"situp1\">" +
				"<P>Step 3: Tighten your abdominal muscles by drawing in your belly to your spine.</P>" +
				"<P>Step 4: Keeping your feet flat on the ground, slowly lift your head followed by your shoulder blades. Pull up until your elbows touch your knees." +
				" Hold the position for a second, then slowly bring your body close to the ground.</P>" +
				"<img src =\"situp2\">"));
		
		addItem(new Exercise("3", "Push-Up", "<big><b><font color=\"#FF0000\">Push-Up</font></b></big>" +				
				"<P>Step 1: Start in a face down prone position on the ground with your feet together. " +
				"Have your hands shoulder-width apart and curl your toes forward towards your head.</P>" +
				"<img src =\"pushup1\">" +
				"<P>Step 2: Raise yourself up with your arms until they are straight. Keep your body in a straight line. Choose one of three positions, " +
				"<b><i>close-hand</i></b> (keep your hands closer together to focus working on your triceps), <b><i>regular</i></b> (keep your hands slightly apart from your shoulders)" +
				" <b><i>and wide-arm</i></b> (keep your hands farther apart to work on your chest muscles).</P>" +
				"<img src =\"pushup2\">" +
				"<P>Step 3: Lower your torso until your elbows form a right angle, keeping your body straight while inhaling a deep breath.</P>" +
				"<img src =\"pushup3\">" +
				"<P>Step 4: Raise yourself up from the ground by pushing it away from your body. Exhale as you rise. Rise until your arms are straight again, but not locked.</P>"));
		
		addItem(new Exercise ("4", "Squat", "<big><b><font color=\"#FF0000\">Squat</font></b></big>" +				
				"<P>Step 1: Place your feet flat on the ground about shoulder-width apart. Point your feet slightly outwards instead of straight ahead.</P>" +
				"<img src =\"squat1\">" +
				"<P>Step 2: Look ahead, and bend your knees slightly. Keep your weight on your heels at all times. Keep your upper back straight. " +
				"Tighten your whole body and pull in your abdominal muscles to your spine.</P>" +
				"<P>Step 3: Extend your arms out for balance and lower yourself slowly so that your thighs are parallel to the ground. Let your lower back arch slightly. " +
				"<b><font color=\"#FF0000\">*Never let your knees extend past your toes, as this can damage your knees*</font></b></P>" +
				"<img src =\"squat2\">" +
				"<P>Step 4: Lift your body pack up by pushing off your heels slowly into the starting position. Keep your back at an angle of 45 to 90 degrees. Do not lock your knees.</P>"));
		
		addItem(new Exercise("5", "Crunch", "<big><b><font color=\"#FF0000\">Crunch</font></b></big>" +				
				"<P>Step 1: Lie down on the ground with your knees bent. Your feet can either be flat on the ground or in the air" +
				" for added intensity.</P>" +
				"<P>Step 2: Place your hands on opposing shoulders so that they are crossed over your chest, or interlock them behind your head. " +
				"<b><font color=\"#FF0000\">*Be careful not to push your head with your hands, as this can place strain on your neck*</font></b></P>" +
				"<img src =\"situp1\">" +
				"<P>Step 3: Lift your shoulders towards the ceiling using your abdominal muscles until your shoulders are off the ground. Exhale while raising your shoulders. Pause for a few seconds. " +
				"<b><font color=\"#FF0000\">*Make sure not to lift your entire back off the ground, as this can place strain on your back*</font></b></P>" +
				"<img src =\"crunch\">" +
				"<P>Step 4: Slowly lower your shoulders back towards the ground while exhaling.</P>" +
				"<P>Step 5: Relax your abdominal muscles before another repetition.</P>"));
		
		addItem(new Exercise("6", "Bicycle Crunch", "<big><b><font color=\"#FF0000\">Bicycle Crunch</font></b></big>" +				
				"<P>Step 1: Lie down on the ground and place your hands behind your head. " +
				"<b><font color=\"#FF0000\">*Be careful not to push your head with your hands, as this can place strain on your neck*</font></b></P>" +
				"<P>Step 2: Keep your feet in the air with your shins parallel to the ground.</P>" +
				"<P>Step 3: Bring your right elbow to your left knee while pulling your left leg in. Extend your right leg out without it touching the ground.</P>" +
				"<P>Step 4: Do the opposite for your left elbow and left leg. " +
				"<b><i>This counts as one repetition. Pause two seconds between movements.</i></b></P>" +
				"<img src =\"bcrunch\">"));
		
		addItem(new Exercise("7", "Plank", "<big><b><font color=\"#FF0000\">Plank</font></b></big>" +				
				"<P>Step 1: Start in a face down prone position on the ground with your feet together. " +
				"Have your hands shoulder-width apart and curl your toes forward towards your head.</P>" +
				"<P>Step 2: Raise yourself up with your arms until they are straight. Keep your body in a straight line.</P>" +
				"<img src=\"pushup2\">" +
				"<P>Step 3: Lower your forearms to the ground at a right angle so that your elbows and palms are flat.</P>" +
				"<img src=\"plank1\">" +
				"<P>Step 4: Tighten your abdominal muscles by drawing in your belly to your spine. Squeeze your glutes. Straighten your body but keep your spine in good posture (neutral).</P>" +
				"<img src=\"plank2\">" +
				"<P>Step 5: Hold this posture as long as you can. Make sure not to raise your behind."));
		
		addItem(new Exercise("8", "Spider Crawl", "<big><b><font color=\"#FF0000\">Spider Crawl</font></b></big>" +				
				"<P>Step 1: Start in a prone position on the ground with your weight on your hands and toes. Keep your elbows bent at 90 degrees.</P>" +
				"<img src=\"spicrawl1\">" +
				"<P>Step 2: Raise your right foot off the ground and rotate your right leg inwards towards your right shoulder as far as possible.</P>" +
				"<img src=\"spicrawl2\">" +
				"<P>Step 3: Return the leg back to its starting position.</P>" +
				"<P>Step 4: Repeat the movement with the left leg. " +
				"<b><i>This counts as one repetition. Make the movements continuous.</i></b></P>"));
		
		addItem(new Exercise("9", "Superman", "<big><b><font color=\"#FF0000\">Superman</font></b></big>" +				
				"<P>Step 1: Lie face down on the ground with your arms fully extended in front of you. " +
				"Simultaneously lift your arms, legs and chest off the ground while exhaling. Hold this position for 2 seconds.</P>" +
				"<img src =\"sm\">" +
				"<P>Step 2: Slowly lower your arms, legs and chest back to the ground while inhaling.</P>"));
		
		addItem(new Exercise("10", "Chin-Up", "<big><b><font color=\"#FF0000\">Chin-Up</font></b></big>" +				
				"<P><font color=\"#FFA600\"><b><i>Requires equipment.</i></b></font></P>" +
				"<P>Step 1: Grab a pull up bar (or a beam which you can use as one) with your palms facing your " +
				"torso and keep your hands less than shoulder-width apart.</P>" +
				"<P>Step 2: With your arms extended, keep your torso as straight as possible and stick your chest out.</P>" +
				"<img src =\"chinup1\">" +
				"<P>Step 3: While exhaling, pull yourself up using your biceps until your chin is at level with the bar. Your back should still be straight. Keep your elbows close to your torso and hold the position for a second.</P>" +
				"<img src =\"chinup2\">" +
				"<P>Step 4: Slowly lower yourself back to the starting position while inhaling.</P>"));
		
		addItem(new Exercise("11", "Pull-Up", "<big><b><font color=\"#FF0000\">Pull-Up</font></b></big>" +				
				"<P><font color=\"#FFA600\"><b><i>Requires equipment.</i></b></font></P>" +
				"<P>Step 1: Grab a pull up bar (or a beam which you can use as one) with your palms facing forward " +
				"and choose one of the following grips: close-hand (distance less than shoulder-width), normal (distance is shoulder-width), and wide-grip (distance is greater than shoulder-width).</P>" +
				"<P>Step 2: With your arms extended, bend your torso back slightly and stick your chest out.</P>" +
				"<img src =\"pullup1\">" +
				"<P>Step 3: While exhaling, pull yourself up using your upper arms until your chest touches the bar. Your back should maintain the same position. Keep your elbows close to your torso and hold the position for a second.</P>" +
				"<img src =\"pullup2\">" +
				"<P>Step 4: Slowly lower yourself back to the starting position while inhaling.</P>" ));
			
	    addItem(new Exercise("12", "ENDURANCE", "<big><b><font color=\"#2D7A0F\">Endurance Exercises</font></b></big> " +
	    		"<P>The exercises under this category will increase your breathing and heart rate over time as well " +
	    		"as help you increase your stamina. Regular practice of the exercises under this category will bring many benefits " +
	    		"to your health. Some of these include an increase in bone density, strengthened immunity and a higher metabolic rate (rate at which" +
	    		" you burn calories).</P>" +
	    		"<P><b><font color=\"#FF0000\">Make sure to always stretch before performing these exercises.</font></b></P>" +
	    		"<P>When you do these exercises, your breathing will become faster naturally as you feel the exercises " +
	    		"becoming more intense. Try and keep your breathing at a steady pace while you engage in endurance training.</P>" +
	    		"<P><b>The amount of repetitions per exercise will vary. This number is given in the description for each exercise.</b></P>" +
	    		"<P><b><font color=\"#FF0000\">If you have any serious medical conditions, do not attempt any of the exercises without seeing a physician or doctor.</font></b></P>"));
	    
	    addItem(new Exercise("13", "Jumping Jack", "<big><b><font color=\"#2D7A0F\">Jumping Jack</font></b></big> " +
	    		"<P>Step 1: Stand straight, with your feet together and arms at your sides.</P>" +
	    		"<img src =\"jack1\">" +
	    		"<P>Step 2: Bend your knees slightly and jump up while extending your legs outwards to about shoulder width and raising your arms towards your head.</P>" +
	    		"<img src =\"jack2\">" +
	    		"<P>Step 3: While returning to the ground, bring your legs and arms back to the original position.</P>" +
	    		"<P><i><b>It is recommended to do about 30-200 repetitions in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("14", "Long Jump", "<big><b><font color=\"#2D7A0F\">Long Jump</font></b></big> " +
	    		"<P>Step 1: Stand with your feet together and ensure that you have plenty of space in front of you.</P>" +
	    		"<P>Step 2: Bend your knees slightly into a squat and jump forward as far as you can.</P>" +
	    		"<img src =\"ljump\">" +
	    		"<P>Step 3: Keep your knees bent as you land.</P>" +
	    		"<P><i><b>It is recommended to perform this exercise for 30-60 seconds in a workout, while jumping the length of the room.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("15", "Alternate Leg Bounding", "<big><b><font color=\"#2D7A0F\">Alternate Leg Bounding</font></b></big> " +
	    		"<P>Description and Steps: Alternate leg bounding is an exaggerated form of running. " +
	    		"Propel yourself off your right foot and bring your left knee up. Keep yourself in the air as long as possible. " +
	    		"Land on your left foot and repeat the movement with the other foot.</P>" +
	    		"<img src =\"bound\">" +
	    		"<P><i><b>It is recommended to do 2 sets of 8 repetitions of this exercise in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("16", "Lateral Jump", "<big><b><font color=\"#2D7A0F\">Lateral Jump</font></b></big> " +
	    		"<P>Step 1: Stand with your knees bent and your feet apart.</P>" +
	    		"<P>Step 2: Jump sideways to the right with as much force as possible and land on your right leg. Keep your knees bent while jumping.</P>" +
	    		"<P>Step 3: Repeat the movement while jumping to the left and landing on your left leg.</P>" +
	    		"<img src =\"latjump\">" +
	    		"<P><i><b>Each pair of jumps counts as one repetition (left and right). It is recommended to do 2 sets of 8 repetitions of this exercise in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("17", "Tuck Jump", "<big><b><font color=\"#2D7A0F\">Tuck Jump</font></b></big> " +
	    		"<P>Step 1: Stand with your feet shoulder-width apart and your knees bent.</P>" +
	    		"<P>Step 2: Jump up in an explosive movement while pulling your knees to your chest as you rise.</P>" +
	    		"<P><img src =\"tjump1\"></P>" +
	    		"<P><img src =\"tjump2\"></P>" +
	    		"<P>Step 3: As you reach the ground, return your legs to the original position and land softly on the balls of your feet.</P>" +
	    		"<P>Allow your legs to bend down slightly and back up to absorb the impact." +
	    		"<P><i><b>It is recommended to do 2 sets of 8 repetitions of this exercise in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("18", "Skipping Rope", "<big><b><font color=\"#2D7A0F\">Skipping Rope</font></b></big> " +
	    		"<P><font color=\"#FFA600\"><b><i>Requires equipment.</i></b></font></P>" +
	    		"<P>Step 2: Extend your forearms at a slight bend away from your body. Step over the rope so it is behind you. Stand on your tiptoes.</P>" +
	    		"<P>Step 3: Use your wrists to swing the rope over your head. Try to keep the motion in the wrists instead of the arms.</P>" +
	    		"<img src =\"jrope1\">" +
	    		"<P>Step 4: When the rope comes close to your feet, hop over it and land on your tiptoes. Repeat the movement at a comfortable pace.</P>" +
	    		"<img src =\"jrope2\">" +
	    		"<P><i><b>  It is recommended to do 2 minutes of this exercise in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("19", "Mountain Climber", "<big><b><font color=\"#2D7A0F\">Mountain Climber</font></b></big> " +
	    		"<P>Step 1: Start in a pushup position with your knees and hip flexed.</P>" +
	    		"<P>Step 2: Bring your right leg forward until it is under your hip.</P>" +
	    		"<img src =\"mclimb1\">" +
	    		"<P>Step 3: Quickly reverse the positions of your legs by extending the right leg fully and bringing the left leg in.</P>" +
	    		"<img src =\"mclimb2\">" +
	    		"<P><i><b> Repeat for 30 seconds in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("20", "Squat Jump", "<big><b><font color=\"#2D7A0F\">Squat Jump</font></b></big> " +
	    		"<P>Step 1: Stand with your feet shoulder-width apart.</P>" +
	    		"<img src =\"sjump1\">" +
	    		"<P>Step 2: Squat down, and immediately jump as high as possible with explosive force.</P>" +
	    		"<img src =\"sjump2\">" +
	    		"<P>Step 2: Land on the balls of your feet softly.</P>" +
	    		"<img src =\"sjump3\">" +
	    		"<P><i><b> It is recommended to do 2 sets of 8 repetitions of this exercise in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("21", "Burpee", "<big><b><font color=\"#2D7A0F\">Burpee</font></b></big> " +
	    		"<P>Step 1: Stand with your feet shoulder-width apart.</P>" +
	    		"<img src =\"burpee1\">" +
	    		"<P>Step 2: Quickly kick your feet behind while bringing your arms down so you land into a push up position.</P>" +
	    		"<img src =\"burpee2\">" +
	    		"<P>Step 3: Lower your torso until your elbows form a right angle, keeping your body straight while inhaling.</P>" +
	    		"<img src =\"burpee3\">" +
	    		"<P>Step 4: Raise yourself up from the ground by pushing it away from your body. Exhale as you rise.</P>" +
	    		"<img src =\"burpee2\">" +
	    		"<P>Step 5: Bring your upper body up into a squat position quickly.</P>" +
	    		"<img src =\"burpee4\">" +
	    		"<P>Step 6: Jump up into the air as high as you can and clap at the highest point.</P>" +
	    		"<img src =\"burpee5\">" +
	    		"<P><i><b> Each sequence of these movements counts as one repetition. It is recommended to do 1 set of 10 repetitions of this exercise in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("22", "Front Kick Lunge", "<big><b><font color=\"#2D7A0F\">Front Kick Lunge</font></b></big> " +
	    		"<P>Step 1: Stand straight with your feet apart.</P>" +
	    		"<P>Step 2: Bring the right knee up and extend your leg in a snapping front kick without locking your knee.</P>" +
	    		"<img src =\"flunge1\">" +
	    		"<P>Step 3: Bring your leg back and immediately take it behind you into a lunge while touching the ground.</P>" +
	    		"<img src =\"flunge2\">" +
	    		"<P>Step 3: Repeat the sequence of movements on the other side.</P>" +
	    		"<P><i><b> It is recommended to do this exercise for one minute in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("23", "BALANCE + FLEXIBILITY", "<big><b><font color=\"#190EE8\">Balance + Flexibility Exercises</font></b></big>" +
	    		"<P>These exercises will help you improve your balance and increase your flexibility.</P>" +
	    		"<P>It is recommended to do these exercises regularly, as maintaining good balance and having flexible joints can improve your performance in everyday life. " +
	    		"Make sure you understand your limits in how far you can stretch, and <font color=\"#FF0000\"><b>don't try to force yourself to do these exercises if you start to feel pain</b></font>. Gradually work your way to the harder " +
	    		"exercises when you start to see improvement in your balance and flexibility.</P>" +
	    		"<P><b>The amount of repetitions per exercise will vary. This number is given in the description for each exercise.</b></P>" +
	    		"<P><b><font color=\"#FF0000\">If you have any serious medical conditions, do not attempt any of the exercises without seeing a physician or doctor.</font></b></P>"	    		
	    		));
	    
	    addItem(new Exercise("24", "Weight Shifts", "<big><b><font color=\"#190EE8\">Weight Shifts</font></b></big>" +
	    		"<P>Step 1: Stand with your feet hip-width apart.</P>" +
	    		"<img src =\"shift1\">" +
	    		"<P>Step 2: Shift all your weight to your right side and lift your left foot off the ground.</P>" +
	    		"<P>Step 3: Hold the position for 30 seconds. Try to keep yourself stable.</P>" +
	    		"<img src =\"shift2\">" +
	    		"<P>Step 4: Repeat on the left side.</P>" +
	    		"<P><i><b> Each pair of shifts counts as one repetition (left and right). It is recommended to do 1 set of 5 repetitions of this exercise in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("25", "Leg Lifts", "<big><b><font color=\"#190EE8\">Leg Lifts</font></b></big>" +
	    		"<P>Step 1: Stand in front of a chair or table with your feet shoulder-width apart.</P>" +
	    		"<P>Step 2: Hold onto the chair or table with both hands and raise your right knee up to your chest while keeping your hips straight. Stay in this position for 2 seconds.</P>" +
	    		"<P>Step 3: Repeat with your left knee. Repeat this part of the exercise 10 times with each leg.</P>" +
	    		"<img src =\"lift1\">" +
	    		"<P>Step 4: Return to the position from step one. Hold onto the chair or table with both hands and lift your right leg backwards while keeping your hip slightly bent and knee straight. " +
	    		"Hold the position for 2 seconds.</P>" +
	    		"<P>Step 5: Repeat with your left leg. Repeat this part of the exercise 10 times with each leg.</P>" +
	    		"<img src =\"lift2\">" +
	    		"<P>Step 6: Return to the position from step one. Hold onto the chair or table with both hands and lift your right leg to your right side while keeping your knee straight. " +
	    		"Hold the position for 2 seconds.</P>" +	    		
	    		"<P>Step 7: Repeat with your left leg. Repeat this part of the exercise 10 times with each leg.</P>" +
	    		"<img src =\"lift3\">"
	    		));
	    	    
	    addItem(new Exercise("26", "Leg Hover Step-Up", "<big><b><font color=\"#190EE8\">Leg Hover Step-Up</font></b></big>" +
	    		"<P>Step 1: Stand sideways on top of a wide step about six to ten inches in height. Allow your left leg to dangle off the side.</P>" +
	    		"<img src =\"stepup1\">" +
	    		"<P>Step 2: Bend your knee and slowly lower your body until your left foot is just above the floor. Pause for a second.</P>" +
	    		"<img src =\"stepup2\">" +
	    		"<P>Step 3: Raise yourself back into the starting position.</P>" +
	    		"<P>Step 4: Repeat with the other knee." +
	    		"<P><i><b> Each pair of step-ups counts as one repetition (left and right knee). It is recommended to do 10 repetitions of this exercise in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("27", "Single Leg Squat", "<big><b><font color=\"#190EE8\">Single Leg Squat</font></b></big>" +
	    		"<P>Step 1: Stand at the bottom of a staircase and place the back of your right heel against the first step. " +
	    		"Hold out the left leg and keep it straight while having your arms held out in front of you.</P>" +
	    		"<img src =\"ssquat1\">" +
	    		"<P>Step 2: Slowly lower yourself to the second or third step. Pause for a second.</P>" +
	    		"<img src =\"ssquat2\">" +
	    		"<P>Step 3: Raise yourself back up to the starting position." +
	    		"<P>Step 4: Repeat with the other leg." +
	    		"<P><i><b> Each pair of squats counts as one repetition (left and right leg). It is recommended to do 10 repetitions of this exercise in a workout.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("28", "Tree Pose", "<big><b><font color=\"#190EE8\">Tree Pose</font></b></big>" +
	    		"<P>Step 1: Stand straight with your feet together, and weight evenly distributed on both feet. Tighten up the muscles in your body.</P>" +
	    		"<P>Step 2: Shift your weight slightly to your left foot, and bring your right foot up and place the sole on your inner left thigh.  The center of your pelvis should be directly over the left foot.</P>" +
	    		"<P>Step 3: Place your hands on your hips, and firmly press your right foot sole into your left thigh, while resisting by pushing with your left thigh.</P>" +
	    		"<P>Step 4: Press your hands together with your thumbs against your chest. Extend your arms upwards with a distance of shoulder-width between the arms. Make sure your fingers are pointing upwards.</P>" +
	    		"<P>Step 4: Press your hands together with your thumbs against your chest. Extend your arms upwards with a distance of shoulder-width between the arms. Make sure your fingers are pointing upwards.</P>" +
	    		"<img src =\"tpose\">" +
	    		"<P><i><b>Hold this pose for 45 seconds in a workout. Repeat the pose with the left side for the same amount of time.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("29", "Eagle Pose", "<big><b><font color=\"#190EE8\">Eagle Pose</font></b></big>" +
	    		"<P>Step 1: Stand straight with your feet together, and weight evenly distributed on both feet. Tighten up the muscles in your body.</P>" +
	    		"<P>Step 2: Bend your knees slightly and lift your left foot up while balancing on the right. Cross your left thigh over your right. Point your left toes down to the ground.</P>" +
	    		"<P>Step 3: Hook the top of your left foot behind the right calf.</P>" +
	    		"<P>Step 4: Stretch your arms straight forward so that they are parallel to the floor. Cross your right arm over the left. " +
	    		"Raise your forearms so that they are perpendicular to the ground. Place your right elbow into the crook of the left. " +
	    		"Pass your right thumb over your left pinky and press your palms together so that all your fingers match up.</P>" +
	    		"<img src =\"epose\">" +
	    		"<P><i><b>Hold this pose for 30 seconds in a workout, and make sure to stretch well after unwinding. Repeat the pose with the legs and arms reversed for the same amount of time.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("30", "King Dancer Pose", "<big><b><font color=\"#190EE8\">King Dancer Pose</font></b></big>" +
	    		"<P>Step 1: Stand straight with your feet together, and weight evenly distributed on both feet. Tighten up the muscles in your body.</P>" +
	    		"<P>Step 2: Bend your right leg back and hold on to the top of your foot with your right hand.</P>" +
	    		"<P>Step 3: Stretch your left arm up towards the ceiling.</P>" +
	    		"<P>Step 3: Bend yourself forward until your left arm faces forward. Press your right foot into your hand.</P>" +
	    		"<P>Step 4: Bend your hips further down until your torso is parallel to the floor.</P>" +
	    		"<img src =\"kdpose\">" +
	    		"<P><i><b>Hold this pose for 30 seconds in a workout, and repeat with the other side for the same amount of time.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("31", "Half Moon Pose", "<big><b><font color=\"#190EE8\">Half Moon Pose</font></b></big>" +
	    		"<P>Step 1: Stand straight with your feet together, and weight evenly distributed on both feet. Tighten up the muscles in your body.</P>" +
	    		"<P>Step 2: Adjust the distance between your feet to about four feet. Turn your right foot out to the right and firm your thighs. Extend your arms and bend your torso to the right from the hip.</P>" +
	    		"<P>Step 3: Keep your left hand on your hip. Press your right hand firmly into the floor while straightening your right leg (<b>do not lock it</b>), and lift your left leg parallel to the floor.</P>" +
	    		"<img src =\"mpose\">" +
	    		"<P><i><b>Hold this pose firmly for 30 seconds in a workout, and repeat with other side for the same amount of time.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("32", "Warrior III Pose", "<big><b><font color=\"#190EE8\">Warrior III Pose</font></b></big>" +
	    		"<P>Step 1: Stand straight with your feet together, and weight evenly distributed on both feet. Tighten up the muscles in your body.</P>" +
	    		"<P>Step 2: Bring your left foot back into a lunge. Bring your right hand to the outer right knee and left hand to the inner knee. Squeeze your knee with both hands, lift your torso slightly and turn it to the right.</P>" +
	    		"<P>Step 3: Stretch your arms forward and parallel to the floor with your palms facing each other. Straighten your right leg while lifting your left leg. Lift your leg until it is parallel with the ground. " +
	    		"Bring your head up slightly and make sure your torso, arms and legs are parallel with the ground.</P>" +
	    		"<img src =\"wpose\">" +
	    		"<P><i><b>Hold this pose firmly for 30 seconds in a workout, and repeat with other side for the same amount of time.</b></i></P>"
	    		));
	    
	    addItem(new Exercise("33", "Standing Forward Bend", "<big><b><font color=\"#190EE8\">Standing Forward Bend</font></b></big>" +
	    		"<P>Step 1: Stand straight with your feet together, and weight evenly distributed on both feet. Tighten up the muscles in your body.</P>" +
	    		"<P>Step 2: Place your hands on your hips. Bend forward from the hip joint while drawing the front torso out. Lengthen the torso as much as possible.</P>" +
	    		"<P>Step 3: Try to place your palms beside or in front of your feet with your knees straight. " +
	    		"If it is not possible, then cross your forearms and hold your elbows. Press your heels firmly into the ground and lift your rear towards the ceiling. " +
	    		"Turn your thighs slightly inward.</P>" +
	    		"<img src =\"spose\">" +
	    		"<P><i><b>Hold this pose for 30 seconds in a workout. When finished, bring your hands to your hips and press your tailbone into your pelvis instead of rolling your spine up. Lengthen and pull your torso up while inhaling.</b></i></P>"
	    		));
	}

	private static void addItem(Exercise item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * An item representing a piece of content.
	 */
	
	

	public static class Exercise {
		public String id;
		public String content;
		public String description;

		public Exercise(String id, String content, String description){
			this.id = id;
			this.content = content;
			this.description = description;
		}
		

		@Override
		public String toString() {
			
			return (content);
		}
	}
}