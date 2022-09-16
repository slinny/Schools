package com.example.android.a20220525_siranli_nycschools.vo.schools


import com.google.gson.annotations.SerializedName

data class SchoolsItem(
    val academicopportunities1: String,
    val academicopportunities2: String,
    val academicopportunities3: String,
    val academicopportunities4: String,
    val academicopportunities5: String,
    @SerializedName("addtl_info1")
    val addtlInfo1: String,
    val admissionspriority11: String,
    val admissionspriority110: String,
    val admissionspriority12: String,
    val admissionspriority13: String,
    val admissionspriority14: String,
    val admissionspriority15: String,
    val admissionspriority16: String,
    val admissionspriority17: String,
    val admissionspriority18: String,
    val admissionspriority19: String,
    val admissionspriority21: String,
    val admissionspriority22: String,
    val admissionspriority23: String,
    val admissionspriority24: String,
    val admissionspriority25: String,
    val admissionspriority26: String,
    val admissionspriority27: String,
    val admissionspriority28: String,
    val admissionspriority29: String,
    val admissionspriority31: String,
    val admissionspriority32: String,
    val admissionspriority33: String,
    val admissionspriority34: String,
    val admissionspriority35: String,
    val admissionspriority36: String,
    val admissionspriority37: String,
    val admissionspriority41: String,
    val admissionspriority42: String,
    val admissionspriority43: String,
    val admissionspriority44: String,
    val admissionspriority46: String,
    val admissionspriority51: String,
    val admissionspriority52: String,
    val admissionspriority53: String,
    val admissionspriority54: String,
    val admissionspriority56: String,
    val admissionspriority61: String,
    val admissionspriority62: String,
    val admissionspriority63: String,
    val admissionspriority64: String,
    val admissionspriority71: String,
    val admissionspriority74: String,
    @SerializedName("advancedplacement_courses")
    val advancedplacementCourses: String,
    val applicants1specialized: String,
    val applicants2specialized: String,
    val applicants3specialized: String,
    val applicants4specialized: String,
    val applicants5specialized: String,
    val applicants6specialized: String,
    val appperseat1specialized: String,
    val appperseat2specialized: String,
    val appperseat3specialized: String,
    val appperseat4specialized: String,
    val appperseat5specialized: String,
    val appperseat6specialized: String,
    @SerializedName("attendance_rate")
    val attendanceRate: String,
    val auditioninformation1: String,
    val auditioninformation2: String,
    val auditioninformation3: String,
    val auditioninformation4: String,
    val auditioninformation5: String,
    val auditioninformation6: String,
    val auditioninformation7: String,
    val bbl: String,
    val bin: String,
    val boro: String,
    val borough: String,
    val boys: String,
    @SerializedName("building_code")
    val buildingCode: String,
    val bus: String,
    @SerializedName("campus_name")
    val campusName: String,
    @SerializedName("census_tract")
    val censusTract: String,
    val city: String,
    val code1: String,
    val code10: String,
    val code2: String,
    val code3: String,
    val code4: String,
    val code5: String,
    val code6: String,
    val code7: String,
    val code8: String,
    val code9: String,
    @SerializedName("college_career_rate")
    val collegeCareerRate: String,
    @SerializedName("common_audition1")
    val commonAudition1: String,
    @SerializedName("common_audition2")
    val commonAudition2: String,
    @SerializedName("common_audition3")
    val commonAudition3: String,
    @SerializedName("common_audition4")
    val commonAudition4: String,
    @SerializedName("common_audition5")
    val commonAudition5: String,
    @SerializedName("common_audition6")
    val commonAudition6: String,
    @SerializedName("common_audition7")
    val commonAudition7: String,
    @SerializedName("community_board")
    val communityBoard: String,
    @SerializedName("council_district")
    val councilDistrict: String,
    val dbn: String,
    val diplomaendorsements: String,
    val directions1: String,
    val directions2: String,
    val directions3: String,
    val directions4: String,
    val directions5: String,
    val directions6: String,
    val directions7: String,
    val earlycollege: String,
    val eligibility1: String,
    val eligibility2: String,
    val eligibility3: String,
    val eligibility4: String,
    val eligibility5: String,
    val eligibility6: String,
    val eligibility7: String,
    @SerializedName("ell_programs")
    val ellPrograms: String,
    @SerializedName("end_time")
    val endTime: String,
    @SerializedName("extracurricular_activities")
    val extracurricularActivities: String,
    @SerializedName("fax_number")
    val faxNumber: String,
    val finalgrades: String,
    val geoeligibility: String,
    val girls: String,
    val grade9geapplicants1: String,
    val grade9geapplicants10: String,
    val grade9geapplicants2: String,
    val grade9geapplicants3: String,
    val grade9geapplicants4: String,
    val grade9geapplicants5: String,
    val grade9geapplicants6: String,
    val grade9geapplicants7: String,
    val grade9geapplicants8: String,
    val grade9geapplicants9: String,
    val grade9geapplicantsperseat1: String,
    val grade9geapplicantsperseat10: String,
    val grade9geapplicantsperseat2: String,
    val grade9geapplicantsperseat3: String,
    val grade9geapplicantsperseat4: String,
    val grade9geapplicantsperseat5: String,
    val grade9geapplicantsperseat6: String,
    val grade9geapplicantsperseat7: String,
    val grade9geapplicantsperseat8: String,
    val grade9geapplicantsperseat9: String,
    val grade9gefilledflag1: String,
    val grade9gefilledflag10: String,
    val grade9gefilledflag2: String,
    val grade9gefilledflag3: String,
    val grade9gefilledflag4: String,
    val grade9gefilledflag5: String,
    val grade9gefilledflag6: String,
    val grade9gefilledflag7: String,
    val grade9gefilledflag8: String,
    val grade9gefilledflag9: String,
    val grade9swdapplicants1: String,
    val grade9swdapplicants10: String,
    val grade9swdapplicants2: String,
    val grade9swdapplicants3: String,
    val grade9swdapplicants4: String,
    val grade9swdapplicants5: String,
    val grade9swdapplicants6: String,
    val grade9swdapplicants7: String,
    val grade9swdapplicants8: String,
    val grade9swdapplicants9: String,
    val grade9swdapplicantsperseat1: String,
    val grade9swdapplicantsperseat10: String,
    val grade9swdapplicantsperseat2: String,
    val grade9swdapplicantsperseat3: String,
    val grade9swdapplicantsperseat4: String,
    val grade9swdapplicantsperseat5: String,
    val grade9swdapplicantsperseat6: String,
    val grade9swdapplicantsperseat7: String,
    val grade9swdapplicantsperseat8: String,
    val grade9swdapplicantsperseat9: String,
    val grade9swdfilledflag1: String,
    val grade9swdfilledflag10: String,
    val grade9swdfilledflag2: String,
    val grade9swdfilledflag3: String,
    val grade9swdfilledflag4: String,
    val grade9swdfilledflag5: String,
    val grade9swdfilledflag6: String,
    val grade9swdfilledflag7: String,
    val grade9swdfilledflag8: String,
    val grade9swdfilledflag9: String,
    val grades2018: String,
    @SerializedName("graduation_rate")
    val graduationRate: String,
    val interest1: String,
    val interest10: String,
    val interest2: String,
    val interest3: String,
    val interest4: String,
    val interest5: String,
    val interest6: String,
    val interest7: String,
    val interest8: String,
    val interest9: String,
    val international: String,
    @SerializedName("language_classes")
    val languageClasses: String,
    val latitude: String,
    val location: String,
    val longitude: String,
    val method1: String,
    val method10: String,
    val method2: String,
    val method3: String,
    val method4: String,
    val method5: String,
    val method6: String,
    val method7: String,
    val method8: String,
    val method9: String,
    val neighborhood: String,
    val nta: String,
    @SerializedName("offer_rate1")
    val offerRate1: String,
    @SerializedName("offer_rate2")
    val offerRate2: String,
    @SerializedName("offer_rate3")
    val offerRate3: String,
    @SerializedName("offer_rate4")
    val offerRate4: String,
    @SerializedName("offer_rate5")
    val offerRate5: String,
    @SerializedName("offer_rate6")
    val offerRate6: String,
    @SerializedName("offer_rate7")
    val offerRate7: String,
    @SerializedName("offer_rate8")
    val offerRate8: String,
    @SerializedName("offer_rate9")
    val offerRate9: String,
    @SerializedName("overview_paragraph")
    val overviewParagraph: String,
    val pbat: String,
    @SerializedName("pct_stu_enough_variety")
    val pctStuEnoughVariety: String,
    @SerializedName("pct_stu_safe")
    val pctStuSafe: String,
    @SerializedName("phone_number")
    val phoneNumber: String,
    val prgdesc1: String,
    val prgdesc10: String,
    val prgdesc2: String,
    val prgdesc3: String,
    val prgdesc4: String,
    val prgdesc5: String,
    val prgdesc6: String,
    val prgdesc7: String,
    val prgdesc8: String,
    val prgdesc9: String,
    @SerializedName("primary_address_line_1")
    val primaryAddressLine1: String,
    val program1: String,
    val program10: String,
    val program2: String,
    val program3: String,
    val program4: String,
    val program5: String,
    val program6: String,
    val program7: String,
    val program8: String,
    val program9: String,
    @SerializedName("psal_sports_boys")
    val psalSportsBoys: String,
    @SerializedName("psal_sports_coed")
    val psalSportsCoed: String,
    @SerializedName("psal_sports_girls")
    val psalSportsGirls: String,
    val ptech: String,
    @SerializedName("requirement1_1")
    val requirement11: String,
    @SerializedName("requirement1_2")
    val requirement12: String,
    @SerializedName("requirement1_3")
    val requirement13: String,
    @SerializedName("requirement1_4")
    val requirement14: String,
    @SerializedName("requirement1_5")
    val requirement15: String,
    @SerializedName("requirement1_6")
    val requirement16: String,
    @SerializedName("requirement1_7")
    val requirement17: String,
    @SerializedName("requirement1_8")
    val requirement18: String,
    @SerializedName("requirement2_1")
    val requirement21: String,
    @SerializedName("requirement2_2")
    val requirement22: String,
    @SerializedName("requirement2_3")
    val requirement23: String,
    @SerializedName("requirement2_4")
    val requirement24: String,
    @SerializedName("requirement2_5")
    val requirement25: String,
    @SerializedName("requirement2_6")
    val requirement26: String,
    @SerializedName("requirement2_7")
    val requirement27: String,
    @SerializedName("requirement2_8")
    val requirement28: String,
    @SerializedName("requirement3_1")
    val requirement31: String,
    @SerializedName("requirement3_2")
    val requirement32: String,
    @SerializedName("requirement3_3")
    val requirement33: String,
    @SerializedName("requirement3_4")
    val requirement34: String,
    @SerializedName("requirement3_5")
    val requirement35: String,
    @SerializedName("requirement3_6")
    val requirement36: String,
    @SerializedName("requirement3_7")
    val requirement37: String,
    @SerializedName("requirement3_8")
    val requirement38: String,
    @SerializedName("requirement4_1")
    val requirement41: String,
    @SerializedName("requirement4_2")
    val requirement42: String,
    @SerializedName("requirement4_3")
    val requirement43: String,
    @SerializedName("requirement4_4")
    val requirement44: String,
    @SerializedName("requirement4_5")
    val requirement45: String,
    @SerializedName("requirement4_6")
    val requirement46: String,
    @SerializedName("requirement4_7")
    val requirement47: String,
    @SerializedName("requirement5_1")
    val requirement51: String,
    @SerializedName("requirement5_2")
    val requirement52: String,
    @SerializedName("requirement5_3")
    val requirement53: String,
    @SerializedName("requirement5_4")
    val requirement54: String,
    @SerializedName("requirement5_5")
    val requirement55: String,
    @SerializedName("requirement5_6")
    val requirement56: String,
    @SerializedName("requirement5_7")
    val requirement57: String,
    @SerializedName("requirement6_1")
    val requirement61: String,
    @SerializedName("requirement6_2")
    val requirement62: String,
    @SerializedName("requirement6_3")
    val requirement63: String,
    @SerializedName("requirement6_7")
    val requirement67: String,
    @SerializedName("school_10th_seats")
    val school10thSeats: String,
    @SerializedName("school_accessibility_description")
    val schoolAccessibilityDescription: String,
    @SerializedName("school_email")
    val schoolEmail: String,
    @SerializedName("school_name")
    val schoolName: String,
    @SerializedName("school_sports")
    val schoolSports: String,
    val seats101: String,
    val seats1010: String,
    val seats102: String,
    val seats103: String,
    val seats104: String,
    val seats105: String,
    val seats106: String,
    val seats107: String,
    val seats108: String,
    val seats109: String,
    val seats1specialized: String,
    val seats2specialized: String,
    val seats3specialized: String,
    val seats4specialized: String,
    val seats5specialized: String,
    val seats6specialized: String,
    val seats9ge1: String,
    val seats9ge10: String,
    val seats9ge2: String,
    val seats9ge3: String,
    val seats9ge4: String,
    val seats9ge5: String,
    val seats9ge6: String,
    val seats9ge7: String,
    val seats9ge8: String,
    val seats9ge9: String,
    val seats9swd1: String,
    val seats9swd10: String,
    val seats9swd2: String,
    val seats9swd3: String,
    val seats9swd4: String,
    val seats9swd5: String,
    val seats9swd6: String,
    val seats9swd7: String,
    val seats9swd8: String,
    val seats9swd9: String,
    @SerializedName("shared_space")
    val sharedSpace: String,
    val specialized: String,
    @SerializedName("start_time")
    val startTime: String,
    @SerializedName("state_code")
    val stateCode: String,
    val subway: String,
    @SerializedName("total_students")
    val totalStudents: String,
    val transfer: String,
    val website: String,
    val zip: String
)