package manina.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class TV {
    private ProgramChecker programChecker;

    @Autowired
    public TV(ProgramChecker programChecker) {
        this.programChecker = programChecker;
    }

    public ProgramChecker getProgramChecker() {
        return programChecker;
    }

    public void setProgramChecker(ProgramChecker programChecker) {
        this.programChecker = programChecker;
    }

    public void tvCheck() {
        programChecker.checkProgram();
    }
}
