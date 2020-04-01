public class GamemodeCommand implements CommandExecutor {
    public GamemodeCommand(JavaPlugin plugin) {
        plugin.getCommand("gm").setExecutor(this);
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;
        if(args.length == 0){
            p.sendMessage("");
            p.sendMessage("§cGamemode: Informe se você quer 0 ou 1.");
            p.sendMessage("");
            return true;
        }
        if(args[0].equalsIgnoreCase("1")) {
            p.setGameMode(GameMode.CREATIVE);
            p.sendMessage("");
            p.sendMessage("§aGamemode: Você entrou no modo CRIATIVO.");
            p.sendMessage("");
            return true;
        }
        if(args[0].equalsIgnoreCase("0")){
            p.setGameMode(GameMode.SURVIVAL);
            p.sendMessage("");
            p.sendMessage("§aGamemode: Você entrou no modo SURVIVAL.");
            p.sendMessage("");
            return true;
        }
       return false;
    }
}
