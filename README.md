# Magic 8 Ball 🎱

A super small project creating a tradtional magic 8 ball machine which will answer your question with a form of yes, no, maybe or try again. The magic 8 ball does not actually  store the question or take the question into consideration, it's simply there to simulate entering a questions. The answer will be randomized using the java.util.Random import, and will return answers which are put into a 'if else' statements.

Answers include:

<ul>
            <li>As i see it yes.</li>
       
            <li>Signs point to yes.</li>
            <li>Don't count on it.</li>
        } else if (rand == 3) {
            System.out.println("Reply hazy, please try again");
        } else if (rand == 4) {
            System.out.println("Outlook not so good.");
        }  else if (rand == 5) {
        System.out.println("HELL YEAH!");
        } else if (rand == 6) {
            System.out.println("HELL NO!");
        } else if (rand == 7) {
            System.out.println("With a little bit more persistence, yes!");
        }
</ul>
