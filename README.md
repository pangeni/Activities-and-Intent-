# Lab 4: Activities and Intent

## Task 1 "Create Two Activities Program"
- Define layout for main activities.
- Add onClick="LaunchSecondActivities" in ButtonSend of main activities.
- Implement button action on OnClick method in main Activities.
- To check interface Action, create LOG_TAG inside LaunchSecondActivities().
- At top of the mainActivity class, add constant for LOG_TAG variable.

## Task 2 "Create and Launch SecondActivity"
- To create new SecondActivity we have to add its own layout and Java files.
- To connect with secondActivities we have to define an activity as a parent of another activity in the AndriodManifext.XML
- An activity communicates with other activities with an Intent.
- Define layout for the second Activity.
- In this task we have implemented an explicit intent to the MainActivities.
- The intent constructor takes two arguments for an explicit intent, an application context and specific component that will receive that intent.
- The startActivity() method call the new intent argument.
- When you click the send button, MainActivity sends the intent and the Andriod system launches SecondActivity.

## Task 3 "Send data from the MainActivity to the SecondActivity"
- Add EditText  to the MainActivity Layout.
- Add a String to the Intent extra.
- Add a public constant at the top of the class to define key for Intent Extra.
- Add private variable At the top of the class to hold EditText.
- Add string to the Intent as an extra with the Extra_Messages as the key value.
- Add TextView in SecondActivity for the message.
- To the onCreate method get the intent that activated intent activities.
- The Get String contain the message from Intent extra using MainActivity.Extra_Messages.
- findViewById() to get reference to the TextView for the message.
- Set the Text of TextView to the String from the Intent extra.
- When you typed message in MainActivity and click Send it will send you to SecondActivity to display message.

## Task 4 "Return Data back to MainActivity"
- Add EditText and Button to Send messages from secondActivities.
- Create a response Intent in the SecondActivity.
- At the top of the class add a public constant to define the key for the intent Extra.
- Add private variable at the top of class which hold EditText.constant
- On onCreate Method Use findViewById() to get a reference to the EditText and assign it to private Variable.
- In the returnReply() method, get EditText string and new Intent for Response.
- Add reply string from the EditText to the new Intent as an Intent Extra.
- set result Result_OK  indicate  to response successful.
- Method finish() call to close the activity and return to mainActivity.
- TextView Element to display the reply.
- The reply Get from the Intent Extra and display.
- a public constant at the top of the class to define the Text_Request key for a particular type of response.
- two private variables to hold the reply header and reply TextView elements.
- In onCreate() method, findViewByID() is to get references from the layout to the reply header and reply TextView elements.
- In the launchSecondActivity() method, change the call to startActivity() to be startActivityForResult(), and include the TEXT_REQUEST key as an argument.
- Inside onActivityResult(), call super.onActivityResult().
- To test for TEXT_REQUEST make sure you process the right Intent result. Also test for RESULT_OK, to make sure that the request was successful.
