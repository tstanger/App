package org.gottablast.gottablast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

/**
 * Created by travis on 2/25/2017.
 */

public class PagetwoActivity extends AppCompatActivity {

    public int parents = 0;
    public int children = 0;
    public int siblings = 0;
    public int pets = 0;

    Random rand = new Random();

    public boolean work;
    public boolean school;
    public boolean misc;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagetwo);
        work = getIntent().getBooleanExtra("work", true);
        school = getIntent().getBooleanExtra("school", true);
        misc = getIntent().getBooleanExtra("misc", true);
    }

    public void toggleParents(View v) {
        parents = parents * -1 + 1;
    }

    public void toggleSiblings(View v) {
        siblings = siblings * -1 + 1;
    }

    public void togglePets(View v) {
        pets = pets * -1 + 1;
    }

    public void toggleChildren(View v) {
        children = children * -1 + 1;
    }

    public void generateExcuse(View v) {
        TextView t = (TextView) findViewById(R.id.excuse);

        if (school) {
            if(parents * siblings * pets * children == 1) {

                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(19)]);

            }
            else if(parents * siblings * pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(18)]);
            }

            else if(parents * siblings * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(16)]);
            }

            else if(parents * pets * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(18)]);
            }

            else if(siblings * pets * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(18)]);
            }

            else if(parents * siblings == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(13)]);
            }

            else if(parents * pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","Hmmm...Try again.","You know what? This is all up to you","I got caught in sharknado. (J.K. try again)","I pooped myself","I peed myself"};
                t.setText(excuse[rand.nextInt(17)]);
            }

            else if(parents * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(15)]);
            }

            else if(siblings * pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(17)]);
            }

            else if(siblings * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My (sibling) is sick I need to go get him.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(15)]);
            }

            else if(pets * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(17)]);
            }

            else if(parents == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(14)]);
            }

            else if(siblings == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(14)]);
            }

            else if(pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(16)]);
            }

            else if(children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(14)]);
            }

            else {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(13)]);
            }


        }


        if(work) {
            if(parents * siblings * pets * children == 1) {

                String[] excuse = {"I have a Doctor’s appointment.", "There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them. ","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(22)]);
            }
            else if(parents * siblings * pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them. ","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(8)]);
            }

            else if(parents * siblings * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(19)]);
            }

            else if(parents * pets * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them. ","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(21)]);
            }

            else if(siblings * pets * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(21)]);
            }

            else if(parents * siblings == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(15)]);
            }

            else if(parents * pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them. ","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My car is not starting up and my parents are already at work.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(17)]);
            }

            else if(parents * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(18)]);
            }

            else if(siblings * pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(17)]);
            }

            else if(siblings * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(18)]);
            }

            else if(pets * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them. ","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(20)]);
            }

            else if(parents == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My car is not starting up and my parents are already at work.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(13)]);
            }

            else if(siblings == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(14)]);
            }

            else if(pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (pet) is acting weird, I need to go home.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(16)]);
            }

            else if(children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","My child’s baby sitter called in sick today and I have no one to watch them.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(17)]);
            }

            else {
                String[] excuse = {"I have a Doctor’s appointment.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(13)]);
            }
        }

        if(misc) {
            if(parents * siblings * pets * children == 1) {

                String[] excuse = {"I have a Doctor’s appointment.", "I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(26)]);

            }
            else if(parents * siblings * pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(21)]);
            }

            else if(parents * siblings * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(23)]);
            }

            else if(parents * pets * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(25)]);
            }

            else if(siblings * pets * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(24)]);
            }

            else if(parents * siblings == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(18)]);
            }

            else if(parents * pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(20)]);
            }

            else if(parents * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(22)]);
            }

            else if(siblings * pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (sibling) is sick I need to go get him.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(19)]);
            }

            else if(siblings * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My (sibling) is sick I need to go get him.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(21)]);
            }

            else if(pets * children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them. ","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(23)]);
            }

            else if(parents == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My car is not starting up and my parents are already at work.","My (parent) wants me to go home and help with some chores around the house.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(17)]);
            }

            else if(siblings == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (sibling) is sick I need to go get him.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(16)]);
            }

            else if(pets == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My ( pet ) is sick so I have to take care of them.","My dog ran away this morning and I’m trying to find it, I’m going to be late.","My (pet) is acting weird, I need to go home.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(18)]);
            }

            else if(children == 1) {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a traffic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","My (child) is currently really sick and I can’t make it in today. ","I have a meeting with my (child’s) teacher today.","My child’s baby sitter called in sick today and I have no one to watch them.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","My (child) just made a huge mess in the house.","My (child) just had a bad allergic reaction to something.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(20)]);
            }

            else {
                String[] excuse = {"I have a Doctor’s appointment.","I forgot Im supposed to dog sit for my neighbor.","There is a trafiic jam and I can’t re-route. ","My car broke down on the way in. I need to go get it checked out.","Sorry my boss is asking me to stay a bit longer.","My refrigerator is supposed to be dropped off sometime today.","I've got some leaky pipes in the house.","I've got a migraine.","I'm having really bad cramps.","I'm locked out of my house.","Ive got food poisoning.","I was caught outside. Howbowdah.","Just didn't feel like it.","You should try being honest.","I pooped myself"};
                t.setText(excuse[rand.nextInt(15)]);
            }
        }
    }
}
