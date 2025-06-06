package com.seaofnodes.simple.node.cpus.riscv;

import com.seaofnodes.simple.SB;
import com.seaofnodes.simple.Utils;
import com.seaofnodes.simple.codegen.CodeGen;
import com.seaofnodes.simple.codegen.RegMask;
import com.seaofnodes.simple.node.MachNode;
import com.seaofnodes.simple.node.ProjNode;
import java.io.ByteArrayOutputStream;

public class ProjRISC extends ProjNode implements MachNode {
    ProjRISC(ProjNode p) { super(p); }

    // Register mask allowed on input i.  0 for no register.
    @Override public RegMask regmap(int i) { return null; }
    // Register mask allowed as a result.
    @Override public RegMask outregmap() {
        return ((MachNode)in(0)).outregmap(_idx);
    }

    // Encoding is appended into the byte array; size is returned
    @Override public int encoding(ByteArrayOutputStream bytes) {
        throw Utils.TODO();
    }
}
