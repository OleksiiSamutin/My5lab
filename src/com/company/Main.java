
package com.company;
public class Main {

    public static void main(String[] args) {
        Text text = new Text("Hello, 200 it's me. " +
                "I was wondering if after all these years you'd like to meet. " +
                "To go over everything. " +
                "They say that time's supposed to heal ya. " +
                "But I ain't done much healing. " +
                "Hello, can you hear me? " +
                "I'm in California dreaming about who we used to be. " +
                "When we were younger and free. " +
                "I've forgotten how it felt before the world fell at our feet. " +
                "There's such a difference between us. " +
                "And a million miles. " +
                "Hello from the other side. " +
                "I must've called a thousand times. " +
                "To tell you I'm sorry. " +
                "For everything that I've done." +
                "But when I call you never. " +
                "Seem to be home. " +
                "Hello from the outside. " +
                "At least I can say that I've tried. " +
                "To tell you I'm sorry. " +
                "For breaking your heart. " +
                "But it don't matter, it clearly. " +
                "Doesn't tear you apart anymore. " +
                "Hello, how are you?. " +
                "It's so typical of me to talk about myself, I'm sorry. " +
                "I hope that you're well. " +
                "Did you ever make it out of that town. " +
                "Where nothing ever happened? " +
                "It's no secret " +
                "That the both of us. " +
                "Are running out of time. " +
                "So hello from the other side (other side). " +
                "I must've called a thousand times (thousand times). " +
                "To tell you I'm sorry. " +
                "For everything that I've done. " +
                "But when I call you never. " +
                "Seem to be home. " +
                "Hello from the outside (outside). " +
                "At least I can say that I've tried (I've tried). " +
                "To tell you I'm sorry. " +
                "For breaking your heart. " +
                "But it don't matter, it clearly. " +
                "Doesn't tear you apart anymore. " +
                "Oh, anymore. " +
                "Oh, anymore. " +
                "Oh, anymore. " +
                "Anymore. " +
                "Hello from the other side (other side). " +
                "I must've called a thousand times (thousand times). " +
                "To tell you I'm sorry. " +
                "For everything that I've done. " +
                "But when I call you never. " +
                "Seem to be home. " +
                "Hello from the outside (outside). " +
                "At least I can say that I've tried (I've tried). " +
                "To tell you I'm sorry. " +
                "For breaking your heart. " +
                "But it don't matter, it clearly. " +
                "Doesn't tear you apart anymore. ");

        Task task = new Task(new String[]{"Hello", "from","the","outside"},text);
        String zz = text.getSentences()[1].toString();
        System.out.println(text.task(new String[]{"Hello", "from","the","outside"}));

        System.err.println(task.numberNine());
    }
}
