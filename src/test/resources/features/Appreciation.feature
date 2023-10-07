@SCRUM-1319
Feature: Default

	Background:
		#@SCRUM-1317
		Given user lands on the login page
		And user enters "hr1@cybertekschool.com" and "UserUser"
		And user clicks the login button
		And user sees the Activity Stream



	
	@SCRUM-1318

	Scenario: Verify, user should be able to send appreciation by clicking on Appreciation subheading from "More" tab under Activity Stream
		When user clicks More button verify user can see Appreciation choice
		Then user clicks Appreciation and upload files icon appears
		When user_clicks_on_upload_files_icon and Upload Files and images Button Appears

		Then user be able click link icon
		And verify user be able to attach a link text and a link
		And verify the link is added

		Then user should be able to create a quote by clicking on the Quote text icon
		And verify a quote is typed

		Then user should be able to add mention by clicking on the add mention icon
		And verify mention is added
		Then user should be able to add tags by clicking add tag icon
		And verify the tag is added
		Then user should be able to send an appreciation
		And verify the appreciation has been sent.