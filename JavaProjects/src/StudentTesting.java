public class StudentTesting
{
    public static void main(String[] args)
    {
        final String computerScienceString = "CMSC";
        final String mathString = "Math";
        final String indianolaString = "Indianola";
        final String westDSMString = "West Des Moines";
        final String ankenyString = "Ankeny";
        final String webString = "WEB";
        final MathMajor mathematics = new MathMajor(mathString);

        final Student joeJackson = new Student("Joe Jackson", mathematics);

        final Course calculusEOP = new EOPCourse(mathString, 151, 4, indianolaString);
        final Course calculusTwo = new Course(mathString, 152, 4);
        final Course linearAlgebra = new Course(mathString, 255, 4);
        final Course introToDataModelingEOP = new EOPCourse(mathString, 208, 4, ankenyString);
        final Course financialMathematicsEOP = new EOPCourse(mathString, 205, 4, westDSMString);
        final Course computerOrganizationEOP = new EOPCourse(computerScienceString, 365, 4, webString);
        final Course printmaking = new Course("Art", 190, 2);
        final Course discreteMath = new Course(computerScienceString, 300, 4);

        joeJackson.addCourse(calculusTwo);
        joeJackson.addCourse(calculusEOP);
        joeJackson.addCourse(linearAlgebra);
        joeJackson.addCourse(printmaking);
        joeJackson.addCourse(discreteMath);

        System.out.println(joeJackson); // Courses should be sorted.

        System.out.println(joeJackson); // Courses should not be sorted.

        joeJackson.addCourse(introToDataModelingEOP); // Add new course

        System.out.println(joeJackson); // Courses should be sorted.

        // Drop and add the same course
        joeJackson.dropCourse(calculusTwo);
        joeJackson.addCourse(calculusTwo);

        System.out.println(joeJackson); // Courses should be sorted.

        joeJackson.addCourse(calculusTwo); // Add a repeated course.

        System.out.println(joeJackson); // Courses should not be sorted because this course was already added.

        joeJackson.dropCourse(computerOrganizationEOP); // Drop a course he is not in.

        System.out.println(joeJackson); // Courses should not be sorted because nothing changed.

        joeJackson.addCourse(computerOrganizationEOP);
        joeJackson.addCourse(financialMathematicsEOP);

        System.out.println(joeJackson); // Courses should be sorted.

        joeJackson.dropCourse(calculusEOP);
        joeJackson.dropCourse(calculusTwo);
        joeJackson.dropCourse(computerOrganizationEOP);
        joeJackson.dropCourse(financialMathematicsEOP);
        joeJackson.dropCourse(introToDataModelingEOP);
        joeJackson.dropCourse(printmaking);
        joeJackson.dropCourse(discreteMath);
        joeJackson.dropCourse(linearAlgebra);

        System.out.println(joeJackson); // Courses should not be sorted because there are no courses

        joeJackson.addCourse(calculusEOP); // Add course
        joeJackson.dropCourse(calculusTwo); // Drop a course that is not in the list

        // Even though the dropCourse didn't make the list change the Courses should be sorted because
        // there was a course successfully added previously.
        System.out.println(joeJackson);

        joeJackson.dropCourse(printmaking);
        joeJackson.dropCourse(calculusEOP);

        //Similar as the previous test, however there are no courses, so, the courses should not be sorted.
        System.out.println(joeJackson);



//        // Normal add courses
//        // Should be possible
//        joeJackson.addCourse(calculusThree);
//        joeJackson.addCourse(financialMathematicsEOP);
//        joeJackson.addCourse(linearAlgebraEOP);
//        System.out.println(joeJackson);
//
//        // Delete all the courses
//        // Should be possible
//        joeJackson.dropCourse(calculusThree);
//        joeJackson.dropCourse(financialMathematicsEOP);
//        joeJackson.dropCourse(linearAlgebraEOP);
//        System.out.println(joeJackson);
//
//        // Delete the same courses twice
//        // There must be error message
//        joeJackson.dropCourse(calculusThree);
//        joeJackson.dropCourse(financialMathematicsEOP);
//        joeJackson.dropCourse(linearAlgebraEOP);
//        System.out.println(joeJackson);
//
//        // Add 10 courses
//        // Should be possible
//        joeJackson.addCourse(calculusEOP);
//        joeJackson.addCourse(calculusTwo);
//        joeJackson.addCourse(calculusThree);
//        joeJackson.addCourse(linearAlgebraEOP);
//        joeJackson.addCourse(financialMathematicsEOP);
//        joeJackson.addCourse(introToDataModelingEOP);
//        joeJackson.addCourse(americanGovernment);
//        joeJackson.addCourse(printmaking);
//        joeJackson.addCourse(introToAlgorithmsEOP);
//        joeJackson.addCourse(computerOrganizationEOP);
//        System.out.println(joeJackson);
//
//        // Add same courses with same department, number, and credit but one is EOP
//        // It shouldn't allow this because they are essentially the same course
//        samSmith.addCourse(calculusThree);
//        samSmith.addCourse(calculusThreeEOP);
//        System.out.println(samSmith);
//
//        // Add three different versions of the same course
//        // It shouldn't be possible.
//        peterSimpson.addCourse(computerOrganization);
//        peterSimpson.addCourse(computerOrganizationEOP);
//        peterSimpson.addCourse(computerOrganizationEOP2);
//        System.out.println(peterSimpson);



//        // Normal case, three 200-level Math courses.
//        // Joe Jackson should be able to declare a Math major.
//        joeJackson.addCourse(calculusThree);
//        joeJackson.addCourse(financialMathematics);
//        joeJackson.addCourse(linearAlgebra);
//        System.out.println(joeJackson);
//
//        // No Math courses
//        // Sam Smith shouldn't be able to declare a Math major.
//        samSmith.addCourse(americanGovernment);
//        samSmith.addCourse(printmaking);
//        samSmith.addCourse(introToAlgorithms);
//        System.out.println(samSmith);
//
//        // Three Math courses but one of them is not 200-level.
//        // Peter Simpson shouldn't be able to declare a Math major.
//        peterSimpson.addCourse(calculus);
//        peterSimpson.addCourse(calculusThree);
//        peterSimpson.addCourse(financialMathematics);
//        System.out.println(peterSimpson);
//
//        // Four courses, three of them are 200-level Math courses.
//        // Caleb Wells should be able to declare a Math major.
//        calebWells.addCourse(americanGovernment);
//        calebWells.addCourse(calculusThree);
//        calebWells.addCourse(financialMathematics);
//        calebWells.addCourse(linearAlgebra);
//        System.out.println(calebWells);
//
//        // Four math courses, just two is 200-level.
//        // Grant Allen shouldn't be able to declare a Math major.
//        grantAllen.addCourse(calculus);
//        grantAllen.addCourse(calculusTwo);
//        grantAllen.addCourse(calculusThree);
//        grantAllen.addCourse(linearAlgebra);
//        System.out.println(grantAllen);
//
//        // Four courses, just two are 200-level Math courses.
//        // Bill Jobs shouldn't be able to declare a Math major.
//        billJobs.addCourse(calculusTwo);
//        billJobs.addCourse(calculusThree);
//        billJobs.addCourse(linearAlgebra);
//        billJobs.addCourse(computerOrganization);
//        System.out.println(billJobs);
//
//        // Five courses, four of them are 200-level Math courses.
//        // Steve Gates should be able to declare a Math major.
//        steveGates.addCourse(calculusThree);
//        steveGates.addCourse(linearAlgebra);
//        steveGates.addCourse(financialMathematics);
//        steveGates.addCourse(introToDataModeling);
//        steveGates.addCourse(americanGovernment);
//        System.out.println(steveGates);
//
//        // No courses.
//        // Stephanie Jay shouldn't be able to declare a Math major.
//        System.out.println(stephanieJay);
//
//        // Having four courses, three 200-level Math courses, drop one Math course, and then try to declare major.
//        // Sandra Park shouldn't be able to declare a Math major.
//        sandraPark.addCourse(printmaking);
//        sandraPark.addCourse(calculusThree);
//        sandraPark.addCourse(linearAlgebra);
//        sandraPark.addCourse(introToDataModeling);
//        sandraPark.dropCourse(calculusThree);
//        System.out.println(sandraPark);
//
//        // Having five courses, four are 200-level Math, declare Math major, and then drop two Math courses.
//        // Emily Watson should be able to declare a Math major.
//        emilyWatson.addCourse(calculusThree);
//        emilyWatson.addCourse(linearAlgebra);
//        emilyWatson.addCourse(financialMathematics);
//        emilyWatson.addCourse(introToDataModeling);
//        emilyWatson.addCourse(computerOrganization);
//        System.out.println(emilyWatson);
//        // Now she shouldn't be able to declare a Math major.
//        emilyWatson.dropCourse(financialMathematics);
//        emilyWatson.dropCourse(linearAlgebra);
//        System.out.println(emilyWatson);
//
//        // Normal case, three 300-level CMSC courses.
//        // CMSC Student 1 should be able to declare a CMSC major.
//        computerScience1.addCourse(introToAlgorithms);
//        computerScience1.addCourse(computerOrganization);
//        computerScience1.addCourse(discreteMath);
//        System.out.println(computerScience1);
//
//        // No CMSC courses
//        // CMSC Student 1 shouldn't be able to declare a CMSC major.
//        computerScience1.dropCourse(introToAlgorithms);
//        computerScience1.dropCourse(computerOrganization);
//        computerScience1.dropCourse(discreteMath);
//        computerScience1.addCourse(introToDataModeling);
//        computerScience1.addCourse(americanGovernment);
//        System.out.println(computerScience1);
//
//        // Three CMSC courses but one of them is not 300-level.
//        // CMSC Student 2 should be able to declare a CMSC major.
//        computerScience2.addCourse(computerScienceCourse);
//        computerScience2.addCourse(discreteMath);
//        computerScience2.addCourse(introToAlgorithms);
//        System.out.println(computerScience2);
//
//        // Four courses, three of them are 300-level CMSC courses.
//        // CMSC Student 2 should be able to declare a CMSC major.
//        computerScience2.addCourse(computerOrganization);
//        System.out.println(computerScience2);
//
//        // No courses.
//        // CMSC Student 1 shouldn't be able to declare a CMSC major.
//        computerScience1.dropCourse(introToDataModeling);
//        computerScience1.dropCourse(americanGovernment);
//        System.out.println(computerScience1);
//
//        // Adding 10 courses, but just two are 300-level CMSC Courses, the rest are not CMSC courses.
//        // CMSC Student 1 shouldn't be able to declare a CMSC major.
//        computerScience1.addCourse(calculus);
//        computerScience1.addCourse(calculusTwo);
//        computerScience1.addCourse(calculusThree);
//        computerScience1.addCourse(linearAlgebra);
//        computerScience1.addCourse(financialMathematics);
//        computerScience1.addCourse(introToDataModeling);
//        computerScience1.addCourse(americanGovernment);
//        computerScience1.addCourse(printmaking);
//        computerScience1.addCourse(introToAlgorithms);
//        computerScience1.addCourse(computerOrganization);
//        System.out.println(computerScience1);
//
//        // Having five courses, two of them are CMSC but not 300-level, one is a 300-level CMSC course.
//        // CMSC Student 2 should be able to declare a CMSC major.
//        computerScience2.addCourse(python);
//        computerScience2.dropCourse(introToAlgorithms);
//        computerScience2.dropCourse(computerOrganization);
//        computerScience2.addCourse(printmaking);
//        computerScience2.addCourse(americanGovernment);
//        System.out.println(computerScience2);
    }
}
