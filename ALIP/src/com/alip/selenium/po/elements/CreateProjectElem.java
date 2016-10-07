package com.alip.selenium.po.elements;

public class CreateProjectElem {
	public static final String REG_PAGE="#problemReg";
	public static final String PROB_TXT="//div[@id='problemReg']/div/h1";
	public static final String REG_TXT="//div[@id='problemReg']/div/h2";
    public static final String PROJ_TYPE=".ng-pristine:first-of-type .col-md-12 .margin-bottom-20.ng-binding";
    public static final String PROJ_CODE=".//*[@id='problemReg']/form[1]/div[1]/div[4]/h2";
    public static final String QC_TOOL=".ng-scope[dropdown-title='Select QC Tools'] .btn-group .dropdown-toggle";
    public static final String QC_TOOL_DRPDWN=".ng-scope[dropdown-title='Select QC Tools'] li";
    public static final String QC_TOOL_DRPDWN_1=".ng-scope[dropdown-title='Select QC Tools'] li:nth-of-type(";
    public static final String QC_TOOL_DRPDWN_2=")";
    public static final String QC_TOOL_LIST_CHK=".ng-scope[dropdown-title='Select QC Tools'] li:nth-of-type(";
    public static final String QC_TOOL_LIST_CHK_1=") .ng-pristine";
    public static final String PLANNED_STRT="#datepicker1[ng-model='project_plannedStartDate1']";
    public static final String PLANNED_END="#datepicker2[ng-model='project_plannedEndDate']";
    public static final String LOCATION="#locationId[ng-model='prob_reg_location']";
    public static final String PROJECT_NAME="#projectName[ng-model='prob_reg_projectname']";
    public static final String GEMBA_UNIT="#subCategory[ng-model='prob_reg_gembaunit']";
    public static final String DESCRIPTION="#Description[ng-model='prob_reg_description']";
    public static final String DIVISION="#subCategory[ng-model='prob_reg_division']";
    public static final String CATEGORY="#subCategory[ng-model='prob_reg_category' ]";
    public static final String SUB_CATEGORY="#subCategory[ ng-model='prob_reg_subCategory']";
    public static final String PARENT_PROJECT="#subCategory[ng-model='prob_reg_parentProject']";
    public static final String CUSTOMER="#subCategory[ng-model='prob_reg_customer']";
    public static final String PROBLEM_START_DATE="#datepicker3[ng-model='prob_reg_plannedStartDate']";
    public static final String PROBLEM_END_DATE="#datepicker4[ng-model='prob_reg_plannedEndDate']";
    public static final String KEYWORDS="#Description[ng-model='prob_reg_Keywords']";
    public static final String GANTT_CHART_PLAN=".chart.col-md-5.col-lg-5.col-sm-3.col-xs-3.margin-top-15";
    public static final String REG_START_DATE="#datepicker11[ng-model='ganttStartDate[$index+1]']";
    public static final String REG_END_DATE="#datepicker12[ng-model='ganttEndDate[$index+1]']";
    public static final String OBSER_ST_DATE="#datepicker21[ng-model='ganttStartDate[$index+1]']";
    public static final String OBSER_END_DATE="#datepicker22[ng-model='ganttEndDate[$index+1]']";
    public static final String ANALYSIS_ST_DATE="#datepicker31[ng-model='ganttStartDate[$index+1]']";
    public static final String ANALYSIS_END_DATE="#datepicker32[ng-model='ganttEndDate[$index+1]']";
    public static final String ACTION_ST_DATE="#datepicker41[ng-model='ganttStartDate[$index+1]']";
    public static final String ACTION_END_DATE="#datepicker42[ng-model='ganttEndDate[$index+1]']";
    public static final String Check_STDT_FLD="#problemSubMenu1 .table-responsive #KPI_table .ng-scope:nth-child(5) .ng-binding";
    public static final String Check_ST_DATE="#datepicker51";
    public static final String Check_END_DATE="#datepicker52[ng-model='ganttEndDate[$index+1]']";
    public static final String STD_ST_DATE="#datepicker61[ng-model='ganttStartDate[$index+1]']";
    public static final String STD_END_DATE="#datepicker62[ng-model='ganttEndDate[$index+1]']";
    public static final String CONCLUDE_ST_DATE="#datepicker71[ng-model='ganttStartDate[$index+1]']";
    public static final String CONCLUDE_END_DATE="#datepicker72[ng-model='ganttEndDate[$index+1]']";
    public static final String KPICODE_LABEL=".col-sm-12.col-xs-12.kpiCode-cont>label";
    public static final String KPICODE=".ng-valid-required[placeholder='Type KPI code / KPI Name / UOM']";
    public static final String KPICODE_AUTO=".ng-valid-required .autocomplete .ng-binding.ng-scope";
    public static final String KPICODE_AUTO_1=".ng-valid-required .autocomplete .ng-binding.ng-scope:nth-of-type(";

    public static final String BASELINE="#numberValidate[ng-model='baselinevalue']";
    public static final String TARGET="#projectName[ng-model='targetvalue']";
    public static final String KPI_ADD=".btn.btn-primary.input-sm.KPI-add-btn.addBtn";
    //public static final String S_NO="class='col-md-1 col-lg-1 text-right-align ng-binding'";
    public static final String EDIT=".paddingRight_15";
    public static final String DELETE=".ng-scope>td>img:nth-child(2)";
    public static final String ROLE="#subCategory[ng-model='prob_reg_employeeRole']";
    public static final String TEAMLIST=".page-header .floatLeft";
    public static final String EMPLOYEE_NAME=".ng-valid-required[placeholder='Type Emp ID / Name / Division']";
    public static final String GRADE="#projectName[ng-model='employeeGrade']";
    public static final String EMP_ADD=".btn.btn-primary.input-sm.emp-add.addBtn";
    public static final String SAVE=".btn-primary[data-target='.modal-save']";
    public static final String SUBMIT=".btn-primary[data-target='.modal-submit']";
    public static final String S_NO="#KPI_table .ng-scope:nth-of-type(1) >td:nth-of-type(1)";
    public static final String SUBMIT_SUCESS_MSG=".submit-sucess";
    public static final String SUCESS_MSG="Problem submitted successfully!";
    public static final String KPI_CODE="#KPI_table .ng-scope:nth-of-type(1) >td:nth-of-type(2)";
    public static final String KPI_CODE_AUTO="#KPI_table .ng-scope:nth-of-type(1) >td:nth-of-type(2)";
    public static final String KPI_NAME="#KPI_table .ng-scope:nth-of-type(1) >td:nth-of-type(3)";
    public static final String UOM="#KPI_table .ng-scope:nth-of-type(1) >td:nth-of-type(4)";
    public static final String KPI_BASELINE="#KPI_table .ng-scope:nth-of-type(1) >td:nth-of-type(5)";
    public static final String ASPIRATION="#KPI_table .ng-scope:nth-of-type(1) >td:nth-of-type(6)";
    public static final String EMP_NAME_AUTO=".autoCompleteInput[ng-model='employeeVal'] .autocomplete .ng-binding.ng-scope";
    public static final String EMP_NAME_AUTO_1=".autoCompleteInput[ng-model='employeeVal'] .autocomplete .ng-binding.ng-scope:nth-of-type(";
    public static final String PROJECT_OWNER_ICON=".popover1";
    public static final String PROJECT_OWNER=".popover-content .facilitatorCont>td:nth-child(1)";
    public static final String PROJECT_OWNER_ID=".popover-content .facilitatorCont>td:nth-child(2)";
    public static final String PROJECT_OWNER_LOCATION=".popover-content .facilitatorCont>td:nth-child(3)";
    //public static final String S_NO="#KPI_table .ng-scope:nth-of-type(1) >td:nth-of-type(1) ";
    //public static final String PLANNED_END="#datepicker2[ng-model='project_plannedEndDate']";
    
    public static final String APPROVE=".margin-bottom-20.approvedBtn";
    public static final String APPROVE_TXT="APPROVE";
    public static final String REJECT=".margin-bottom-20.rejected-btn";
    public static final String REJECT_TXT="REJECT";
    public static final String COMMENT="#projectName[ng-model='comment']";
    public static final String MODERATION_SUBMIT=".btn.btn-primary.input-sm[ng-click='saveBtnClick(1);']";
    public static final String MODERATION_SUBMIT_MSG=".alert.alert-success.submit-sucess";
    public static final String MODERATION_SUBMIT_MSG_TXT="Problem Moderated successfully!";
}