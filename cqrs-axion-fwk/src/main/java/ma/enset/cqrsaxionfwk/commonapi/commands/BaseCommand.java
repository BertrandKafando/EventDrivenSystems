package ma.enset.cqrsaxionfwk.commonapi.commands;

import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
//les commandes sont immutables
public class BaseCommand <T> {

    @TargetAggregateIdentifier
   @Getter private   T id;

    public BaseCommand(T id) {
        this.id = id;
    }
}
