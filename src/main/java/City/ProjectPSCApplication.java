package City;

import City.resources.City;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ProjectPSCApplication extends Application<ProjectPSCConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ProjectPSCApplication().run(args);
    }

    @Override
    public String getName() {
        return "City";
    }

    @Override
    public void initialize(final Bootstrap<ProjectPSCConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ProjectPSCConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.jersey().register(
                new City()
        );
    }

}
