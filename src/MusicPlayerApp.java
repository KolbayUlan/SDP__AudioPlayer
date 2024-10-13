public class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play("mp3", "music1.mp3");

        AudioPlayer WAVPlayer = new AudioAdapter("WAV");
        WAVPlayer.play("WAV", "music2.wav");

        AudioPlayer AACPlayer = new AudioAdapter("aac");
        AACPlayer.play("AAC", "music3.aac");
    }
}
