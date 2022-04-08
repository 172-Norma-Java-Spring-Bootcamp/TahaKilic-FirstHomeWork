package com.taha.example;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "version",defaultPhase = LifecyclePhase.COMPILE)
public class SimpleMavenPlugin extends AbstractMojo {
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        String name="Ali";
        String lastName="Demir";
        getLog().info("Adınız:"+name+"\n Soyadınız:"+lastName);
    }
}
