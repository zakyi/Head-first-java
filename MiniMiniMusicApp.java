import javax.sound.midi.*;

public class MiniMiniMusicApp {

	public static void main(String[] args) {
		MiniMiniMusicApp Mini = new MiniMiniMusicApp();
		Mini.play();
	}

	public void play() {
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();

			Sequence seq = new Sequence(Sequence.PPQ, 4);

			Track track = seq.createTrack();

			ShortMessage a = new ShortMessage();
			//144代表Note on事件，1代表钢琴的序号，44代表第44个琴键，100代表音量大小为100
			a.setMessage(144, 1, 44, 100);
			//1代表在第一拍
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);

			ShortMessage b = new ShortMessage();
			//128代表NOTE OFF, 声音会在NOTE ON 和 NOTE OFF之间发生
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);

			player.setSequence(seq);

			player.start();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}