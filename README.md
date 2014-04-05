Android Swipe
=============

## Basic example of swipe for Android


Simple example of effect navigation Swipe. The effect is based on the amount of messages that compose the List executed. The list of messages is defined by the programmer. The method to customize messages for testing is described below:

<pre>  
    
    /*Creating messages of example*/
    private void createMessages(List<Message> messages){
    	Message firstMSG = new Message(1, "Message One");
    	Message secondMSG = new Message(2, "Message Two");
    	Message thirdMSG = new Message(3, "Message Three");
    	Message fourthMSG = new Message(4, "Message Four");
    	Message fifthMSG = new Message(5, "Message Five");
    	messages.add(firstMSG);
    	messages.add(secondMSG);
    	messages.add(thirdMSG);
    	messages.add(fourthMSG);
    	messages.add(fifthMSG);
    } 
    
</pre>

The effect will based from the configuration this method. The main technologies used in the example were:

1. ViewPager;
2. Fragment;
3. FragmentPagerAdapter.

> The 'android-support-v4.jar' library was used to activate the Swipe support for Android versions that do not natively support this technology.

## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -m "Add some feature"`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request  :)

English is the universal language nowadays, so please don't create or comment on issues using another language.

## History

For detailed changelog, see [Releases](https://github.com/autscc/android-swipe/releases).

## License

[MIT License](http://opensource.org/licenses/MIT)
