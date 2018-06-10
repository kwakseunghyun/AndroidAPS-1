package info.nightscout.androidaps.plugins.PumpCommon.hw.rileylink.ble.defs;

/**
 * Created by andy on 22/05/2018.
 */

public enum RFSpyCommand {

    GetState(1), //
    GetVersion(2), //
    GetPacket(3), // aka Listen, receive
    Send(4), //
    SendAndListen(5), //
    UpdateRegister(6), //
    Reset(7), //

    ;

    public byte code;


    RFSpyCommand(int code) {
        this.code = (byte) code;
    }

}
