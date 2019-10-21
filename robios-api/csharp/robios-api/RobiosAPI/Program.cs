using ai.humanrobotics.api.csharp;
using System;

namespace ai.humanrobotics.examples
{
    class Program
    {
        private const string API_KEY = "9106b136-1424-4b2a-be0a-6e313dc2a80d";
        private const string ROBOT_ADDRESS = "192.168.15.27";

        static void Main(string[] args)
        {
            IRobios robios = RobiosApi.Get(API_KEY, ROBOT_ADDRESS);

            robios.Say("Olá Mundo!");

            robios.Close();
        }
    }
}
